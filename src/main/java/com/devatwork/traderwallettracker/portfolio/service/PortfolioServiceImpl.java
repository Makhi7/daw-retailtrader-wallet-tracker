package com.devatwork.traderwallettracker.portfolio.service;

import com.devatwork.traderwallettracker.investment.Investment;
import com.devatwork.traderwallettracker.portfolio.Portfolio;
import com.devatwork.traderwallettracker.portfolio.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioServiceImpl implements PortfolioService{

    @Autowired
    private PortfolioRepository portfolioRepository;

    @Override
    public List<Portfolio> findAll() {
        return portfolioRepository.findAll();
    }

    @Override
    public Portfolio findById(Long id) {
        return null;
    }

    @Override
    public Portfolio create(Portfolio portfolio) {
        return null;
    }

    @Override
    public Portfolio update(Portfolio portfolio) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Portfolio addInvestment(Long portfolioId, Long investmentId) {
        return null;
    }

    @Override
    public Portfolio removeInvestment(Long portfolioId, Investment investment) {
        return null;
    }
}
