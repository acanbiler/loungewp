package com.ozu.lounge.model.icecream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cone implements IceCream {
    private String description;
    private Double cost;

    @Override
    public String description() {
        return description;
    }

    @Override
    public Double cost() {
        return 5.0;
    }
}
