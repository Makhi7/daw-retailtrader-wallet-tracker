package com.devatwork.traderwallettracker.portfolio;

import com.devatwork.traderwallettracker.investment.Investment;
import com.devatwork.traderwallettracker.trader.Trader;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "porfolios")
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Date createdAt;
    private Date updatedAt;

    @OneToMany(
            mappedBy = "portfolio", cascade = CascadeType.ALL
    )
    private Trader trader;

    private List<Investment> investmentList;

    public Portfolio(String name, String description, Date createdAt, Date updatedAt, Trader trader, List<Investment> investmentList) {
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.trader = trader;
        this.investmentList = investmentList;
    }
}
