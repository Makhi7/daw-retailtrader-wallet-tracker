package com.devatwork.traderwallettracker.portfolio;

import com.devatwork.traderwallettracker.investment.Investment;
import com.devatwork.traderwallettracker.portfolio.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/portfolios")
public class PortfolioController {

    @Autowired
    private PortfolioService portfolioService;
    @Autowired
    private PortfolioRepository portfolioRepository;

    @GetMapping
    public ResponseEntity<List<Portfolio>> findAll(){
        List <Portfolio> portfolios = portfolioService.findAll();
        return new ResponseEntity<>(portfolios, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Portfolio> create(@RequestBody Portfolio portfolio){
        Portfolio createdPortfolio = portfolioService.create(portfolio);

        return new ResponseEntity<>(createdPortfolio, HttpStatus.CREATED);
    }

    @PostMapping("/{portfolioId}/investments")
    public ResponseEntity<Portfolio> addInvestment(@PathVariable Long portfolioId, @RequestBody Investment investment){
        Portfolio portfolio = portfolioService.addInvestment(portfolioId,investment);

        if (portfolio == null){
            return new ResponseEntity<>(portfolio, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(portfolio, HttpStatus.OK);
    }

}
