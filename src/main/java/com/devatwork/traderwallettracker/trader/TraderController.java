package com.devatwork.traderwallettracker.trader;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TraderController {

    @Autowired
    private TraderRepository traderRepo;

    @GetMapping("/showTraders")
    public ModelAndView displayTraders()
    {
        ModelAndView mav = new ModelAndView("list-traders");
        List<Trader> list = traderRepo.findAll();
        mav.addObject("traders",list);
        return mav;
    }


}
