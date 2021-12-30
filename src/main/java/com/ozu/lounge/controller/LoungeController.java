package com.ozu.lounge.controller;

import com.ozu.lounge.model.coffee.CoffeeRequest;
import com.ozu.lounge.model.icecream.IceCreamRequest;
import com.ozu.lounge.model.pizza.Pizza;
import com.ozu.lounge.model.pizza.PizzaRequest;
import com.ozu.lounge.model.ticket.Ticket;
import com.ozu.lounge.service.LoungeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/lounge")
public class LoungeController {
    private @Autowired
    LoungeService loungeService;

    @GetMapping(value = "/ticket")
    public Ticket getTicket() {
        return loungeService.getTicket();
    }

    @PostMapping(value = "/ticket/upgrade")
    public String upgradeTicket(@RequestBody Map<String, List<Integer>> upgradeList) {
        List<Integer> list = upgradeList.get("list");
        return loungeService.upgradeTicket(list);
    }

    @PostMapping(value = "/pizza")
    public Pizza bakePizza(@RequestBody PizzaRequest pizzaRequest) {
        return loungeService.bakePizza(pizzaRequest);
    }

    @PostMapping(value = "/coffee")
    public Double prepareCoffee(@RequestBody CoffeeRequest coffeeRequest) {
        return loungeService.prepareCoffee(coffeeRequest);
    }

    @PostMapping(value = "/ice-cream")
    public Double prepareIceCream(@RequestBody IceCreamRequest iceCreamRequest) {
        return loungeService.prepareIceCream(iceCreamRequest);
    }
}
