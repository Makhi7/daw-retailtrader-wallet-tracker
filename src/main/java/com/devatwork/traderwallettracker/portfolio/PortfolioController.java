package com.devatwork.traderwallettracker.portfolio;

import com.devatwork.traderwallettracker.portfolio.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/portfolios")
public class PortfolioController {

    @Autowired
    private PortfolioService portfolioService;

    @GetMapping
    public ResponseEntity<List<Portfolio>> findAll(){
        List <Portfolio> portfolios = portfolioService.findAll();
        return new ResponseEntity<>(portfolios, HttpStatus.OK);
    }

}
