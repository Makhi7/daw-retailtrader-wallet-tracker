package com.devatwork.traderwallettracker.trader.service;

import com.devatwork.traderwallettracker.trader.Trader;
import com.devatwork.traderwallettracker.trader.TraderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraderServiceImpl implements TraderService{

    @Autowired
    private TraderRepository traderRepository;

    @Override
    public Trader findById(Long id) {
        return traderRepository.findById(id).orElse(null);
    }

    @Override
    public Trader findByUsername(String username) {
        // TODO:
        // find out why I can't access the method when I call
        return null;
    }

    @Override
    public Trader create(Trader trader) {
        return traderRepository.save(trader);
    }

    @Override
    public Trader update(Trader trader) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
