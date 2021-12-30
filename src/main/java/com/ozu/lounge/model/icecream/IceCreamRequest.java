package com.ozu.lounge.model.icecream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class IceCreamRequest {
    private Integer chocolate;
    private Integer blueberry;
    private Integer vanilla;
}
