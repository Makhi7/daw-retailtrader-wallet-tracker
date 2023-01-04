package com.devatwork.traderwallettracker.trader;


import com.devatwork.traderwallettracker.trader.service.TraderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/traders")
public class TraderController {

    @Autowired
//    private TraderRepository traderRepo;
    private TraderService traderService;
//    @GetMapping("/showTraders")
//    public ModelAndView displayTraders()
//    {
//        ModelAndView mav = new ModelAndView("list-traders");
//        List<Trader> list = traderRepo.findAll();
//        mav.addObject("traders",list);
//        return mav;
//    }

    @PostMapping
    public ResponseEntity<Trader> create(@RequestBody Trader trader){
        Trader createdTrader = traderService.
                create(trader);
        return new ResponseEntity<>(createdTrader, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Trader> findById(@PathVariable Long id){
        Trader trader = traderService.findById(id);
        if (trader == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(trader,HttpStatus.OK);
    }
//    public String ("/saveTrader")
    // TODO:
    // Create a Post req
    // Afterwards refactor my models and their services ideation


}
