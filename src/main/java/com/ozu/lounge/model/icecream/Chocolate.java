package com.ozu.lounge.model.icecream;

public class Chocolate extends IceCreamDecorator {
    IceCream iceCream;

    public Chocolate(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String description() {
        return iceCream.description() + ", Mocha";
    }

    @Override
    public Double cost() {
        return iceCream.cost() + 1;
    }
}
