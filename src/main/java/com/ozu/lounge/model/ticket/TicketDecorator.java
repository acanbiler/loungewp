package com.ozu.lounge.model.ticket;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class TicketDecorator implements Ticket {
    private Ticket ticket;

    @Override
    public String decorate() {
        return ticket.decorate();
    }
}
