package com.devatwork.traderwallettracker.investment.service;

import com.devatwork.traderwallettracker.investment.Investment;

public interface InvestmentService {
    Investment findById(Long id);
    Investment create(Investment investment);
    Investment update(Investment investment);
    void delete(Long id);
}
