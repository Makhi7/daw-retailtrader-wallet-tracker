package com.devatwork.traderwallettracker.trader;


import com.devatwork.traderwallettracker.portfolio.Portfolio;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "Trader")
@Table (
        name = "trader_tbl",
        uniqueConstraints = {
                @UniqueConstraint(name = "trader_email_unique", columnNames = "email")
        }
)
public class Trader {

    @Id
    @SequenceGenerator(
            name = "trader_sequence",
            sequenceName = "trader_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "trader_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column (
            name = "username",
            unique = true
    )
    private String username;

    @Column(
            name = "name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String name;

    @Column(
            name = "surname",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String surname;

    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String email;

    @OneToMany(mappedBy = "trader",cascade = CascadeType.ALL)
    private List<Portfolio> portfolioList;


    public Trader(String name,
                  String surname,
                  String email, List<Portfolio> portfolioList)
    {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.portfolioList = portfolioList;

    }
}
