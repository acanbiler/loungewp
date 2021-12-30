package com.ozu.lounge.model.ticket;

public class ExtraLegRoom extends TicketDecorator {
    public ExtraLegRoom(Ticket ticket) {
        super(ticket);
    }

    public String decorate() {
        return super.decorate() + decorateWithExtraLegRoom();
    }

    private String decorateWithExtraLegRoom() {
        return " Added Extra Leg Room";
    }
}
