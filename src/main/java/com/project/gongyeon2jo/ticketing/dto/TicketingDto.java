package com.project.gongyeon2jo.ticketing.dto;
import com.project.gongyeon2jo.ticketing.domain.Ticketing;
import lombok.*;

@Data
@Builder
public class TicketingDto {

    private String ticketingId;
    private String email;
    private String phonenumber;
    private String credit;
    private String leftCredit;
    private String performanceId;

}
