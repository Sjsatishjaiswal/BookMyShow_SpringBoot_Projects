package com.example.book_my_show.convetors;


import com.example.book_my_show.Entities.TicketEntity;
import com.example.book_my_show.EntryDtos.TicketEntryDto;

public class TicketConvertors {


    public static TicketEntity convertEntryToEntity(TicketEntryDto ticketEntryDto){

        TicketEntity ticketEntity = new TicketEntity();
        return ticketEntity;

    }
}

