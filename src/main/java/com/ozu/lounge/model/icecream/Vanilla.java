package com.ozu.lounge.model.icecream;

public class Vanilla extends IceCreamDecorator {
    IceCream iceCream;

    public Vanilla(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String description() {
        return iceCream.description() + ", Milk";
    }

    @Override
    public Double cost() {
        return iceCream.cost() + 0.5;
    }
}
