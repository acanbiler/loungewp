package com.ozu.lounge.model.ticket;

public class OzuExperience extends TicketDecorator {
    public OzuExperience(Ticket ticket) {
        super(ticket);
    }

    public String decorate() {
        return super.decorate() + decorateWithOzuExperience();
    }

    private String decorateWithOzuExperience() {
        return " Added Ozu Experience";
    }
}
