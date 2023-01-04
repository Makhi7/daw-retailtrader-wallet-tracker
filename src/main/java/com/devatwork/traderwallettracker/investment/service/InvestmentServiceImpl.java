package com.devatwork.traderwallettracker.investment.service;

import com.devatwork.traderwallettracker.investment.Investment;
import com.devatwork.traderwallettracker.investment.InvestmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestmentServiceImpl implements InvestmentService{

    @Autowired
    private InvestmentRepository investmentRepository;

    @Override
    public Investment findById(Long id) {
        return null;
    }

    @Override
    public Investment create(Investment investment) {
        return investmentRepository.save(investment);
    }

    @Override
    public Investment update(Investment investment) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
