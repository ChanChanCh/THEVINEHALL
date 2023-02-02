package com.project.gongyeon2jo.ticketing.model;


import lombok.Data;
import org.hibernate.tuple.GeneratedValueGeneration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity(name = "ticketing")
public class Ticketing {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketingId;
//    private String email;
//    private String phonenumber;

//    private String credit;
//    private String leftCredit;

    private String price;

    private int ticketingQuantity;

    private LocalDateTime ticketingDate;
    private String performanceId;
    private String userId;

    private String seats;

}