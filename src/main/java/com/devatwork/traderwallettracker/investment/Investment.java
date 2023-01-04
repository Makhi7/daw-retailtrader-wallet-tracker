package com.devatwork.traderwallettracker.investment;

import com.devatwork.traderwallettracker.portfolio.Portfolio;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "investments")
public class Investment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Integer quantity;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(
            name ="porfolio_id"
    )
    private Portfolio portfolio;
}
