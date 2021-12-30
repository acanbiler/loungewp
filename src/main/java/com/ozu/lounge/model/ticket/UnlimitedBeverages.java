package com.ozu.lounge.model.ticket;

public class UnlimitedBeverages extends TicketDecorator {
    public UnlimitedBeverages(Ticket ticket) {
        super(ticket);
    }

    public String decorate() {
        return super.decorate() + decorateWithUnlimitedBeverages();
    }

    private String decorateWithUnlimitedBeverages() {
        return " Added Unlimited Beverages";
    }
}