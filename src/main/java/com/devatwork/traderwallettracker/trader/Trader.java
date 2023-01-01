package com.devatwork.traderwallettracker.trader;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "Trader")
@Table (
        name = "trader_tbl")
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
    private String name;
    private String surname;
    private String email;
    private Long accountBalance;

    public Trader(String name,
                  String surname,
                  String email,
                  Long accountBalance)
    {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.accountBalance = accountBalance;
    }
}
