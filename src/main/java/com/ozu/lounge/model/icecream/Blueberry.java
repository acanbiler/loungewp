package com.ozu.lounge.model.icecream;

public class Blueberry extends IceCreamDecorator {
    IceCream iceCream;

    public Blueberry(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String description() {
        return iceCream.description() + ", Whip";
    }

    @Override
    public Double cost() {
        return iceCream.cost() + 0.25;
    }
}
