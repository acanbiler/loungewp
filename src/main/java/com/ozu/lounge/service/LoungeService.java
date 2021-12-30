package com.ozu.lounge.service;

import com.ozu.lounge.model.coffee.*;
import com.ozu.lounge.model.icecream.*;
import com.ozu.lounge.model.pizza.Pizza;
import com.ozu.lounge.model.pizza.PizzaRequest;
import com.ozu.lounge.model.ticket.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoungeService {
    public static final TicketImpl ticket = new TicketImpl("Abdullah Can Biler", 12345, new ArrayList<>());

    public Ticket getTicket() {
        return ticket;
    }

    public String upgradeTicket(List<Integer> upgradeList) {
        if (upgradeList.isEmpty()) {
            ticket.getUpgradeList().clear();
            return "Cleared";
        }
        Ticket upgradedTicket = ticket;
        if (upgradeList.contains(1)) {
            upgradedTicket = new EmergencyExit(upgradedTicket);
            ticket.getUpgradeList().add(1);
        } else {
            ticket.getUpgradeList().removeIf(i -> i == 1);
        }
        if (upgradeList.contains(2)) {
            upgradedTicket = new ExtraLegRoom(upgradedTicket);
            ticket.getUpgradeList().add(2);
        } else {
            ticket.getUpgradeList().removeIf(i -> i == 2);
        }
        if (upgradeList.contains(3)) {
            upgradedTicket = new OzuExperience(upgradedTicket);
            ticket.getUpgradeList().add(3);
        } else {
            ticket.getUpgradeList().removeIf(i -> i == 3);
        }
        if (upgradeList.contains(4)) {
            upgradedTicket = new UnlimitedBeverages(upgradedTicket);
            ticket.getUpgradeList().add(4);
        } else {
            ticket.getUpgradeList().removeIf(i -> i == 4);
        }

        return upgradedTicket.decorate();
    }

    public Pizza bakePizza(PizzaRequest pizzaRequest) {
        Pizza.PizzaBuilder newPizza = new Pizza.PizzaBuilder(pizzaRequest.getSize());
        if (pizzaRequest.getCheese())
            newPizza.cheese(true);
        if (pizzaRequest.getMushroom())
            newPizza.mushroom(true);
        if (pizzaRequest.getPepperoni())
            newPizza.pepperoni(true);

        return newPizza.build();
    }

    public Double prepareCoffee(CoffeeRequest coffeeRequest) {
        Coffee espresso = new Espresso("Espresso", 12.0);
        if (coffeeRequest.getMilk())
            espresso = new Milk(espresso);
        if (coffeeRequest.getMocha())
            espresso = new Mocha(espresso);
        if (coffeeRequest.getWhip())
            espresso = new Whip(espresso);

        return espresso.cost();
    }

    public Double prepareIceCream(IceCreamRequest iceCreamRequest) {
        IceCream iceCream = new Cone("Cone", 8.0);
        if (iceCreamRequest.getBlueberry() > 0)
            for (int i = 1; i <= iceCreamRequest.getBlueberry(); i++)
                iceCream = new Blueberry(iceCream);
        if (iceCreamRequest.getChocolate() > 0)
            for (int i = 1; i <= iceCreamRequest.getChocolate(); i++)
                iceCream = new Chocolate(iceCream);
        if (iceCreamRequest.getVanilla() > 0)
            for (int i = 1; i <= iceCreamRequest.getVanilla(); i++)
                iceCream = new Vanilla(iceCream);

        return iceCream.cost();
    }
}
