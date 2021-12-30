package com.ozu.lounge.model.ticket;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TicketRequest {
    private String name;
    private String pnrCode;
    private List<String> properties;
}
