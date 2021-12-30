package com.ozu.lounge.model.ticket;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class TicketImpl implements Ticket {
    private String name;
    private Integer pnrCode;
    private List<Integer> upgradeList;

    @Override
    public String decorate() {
        return "";
    }
}
