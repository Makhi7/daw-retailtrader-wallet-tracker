package com.devatwork.traderwallettracker.trader.service;

import com.devatwork.traderwallettracker.trader.Trader;

public interface TraderService {
    Trader findById(Long id);
    Trader findByUsername(String username);
    Trader create(Trader trader);
    Trader update(Trader trader);
    void delete(Long id);
}
