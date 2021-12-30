package com.ozu.lounge.model.ticket;

public class EmergencyExit extends TicketDecorator {
    public EmergencyExit(Ticket ticket) {
        super(ticket);
    }

    public String decorate() {
        return super.decorate() + decorateWithEmergencyExit();
    }

    private String decorateWithEmergencyExit() {
        return " Added Emergency Exit";
    }
}
