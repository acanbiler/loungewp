package com.ozu.lounge.model.icecream;

public abstract class IceCreamDecorator implements IceCream {
    private IceCream iceCream;

    @Override
    public String description() {
        return iceCream.description();
    }

    @Override
    public Double cost() {
        return iceCream.cost();
    }
}
