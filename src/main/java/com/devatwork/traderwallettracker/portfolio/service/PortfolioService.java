package com.devatwork.traderwallettracker.portfolio.service;

import com.devatwork.traderwallettracker.investment.Investment;
import com.devatwork.traderwallettracker.portfolio.Portfolio;

import java.util.List;

public interface PortfolioService {
    List<Portfolio> findAll();
    Portfolio findById(Long id);
    Portfolio create(Portfolio portfolio);
    Portfolio update(Portfolio portfolio);
    void delete(Long id);
    Portfolio addInvestment(Long portfolioId,
                            Long investmentId);
    Portfolio removeInvestment(Long portfolioId,
                               Investment investment);
}
