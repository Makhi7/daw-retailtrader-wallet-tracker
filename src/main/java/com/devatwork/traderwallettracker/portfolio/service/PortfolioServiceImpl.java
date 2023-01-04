package com.devatwork.traderwallettracker.portfolio.service;

import com.devatwork.traderwallettracker.investment.Investment;
import com.devatwork.traderwallettracker.investment.InvestmentRepository;
import com.devatwork.traderwallettracker.portfolio.Portfolio;
import com.devatwork.traderwallettracker.portfolio.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioServiceImpl implements PortfolioService{

    @Autowired
    private PortfolioRepository portfolioRepository;

    @Autowired
    private InvestmentRepository investmentRepository;

    @Override
    public List<Portfolio> findAll() {
        return portfolioRepository.findAll();
    }

    @Override
    public Portfolio findById(Long id) {
        return portfolioRepository.findById(id).orElse(null);
    }

    @Override
    public Portfolio create(Portfolio portfolio) {
        return portfolioRepository.save(portfolio);
    }

    @Override
    public Portfolio update(Portfolio portfolio) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Portfolio addInvestment(Long portfolioId, Investment investment) {
        Portfolio portfolio = portfolioRepository.findById((portfolioId)).orElse(null);

        if(portfolio == null){
            return null;
        }

        investment.setPortfolio(portfolio);
        Investment savedInvestment = investmentRepository.save(investment);
        portfolio.getInvestmentList().add(savedInvestment);

        return portfolioRepository.save(portfolio);

    }

    @Override
    public Portfolio removeInvestment(Long portfolioId, Long investmentId) {
        Portfolio portfolio = portfolioRepository.findById(portfolioId).orElse(null);

        if (portfolio == null){
            return null;
        }

        Investment investment = investmentRepository.findById(investmentId).orElse(null);

        if (investment == null || !investment.getPortfolio().equals(portfolio)){
            return null;
        }

        investmentRepository.delete(investment);
        portfolio.getInvestmentList().remove(investment);
        return portfolioRepository.save(portfolio);

    }
}
