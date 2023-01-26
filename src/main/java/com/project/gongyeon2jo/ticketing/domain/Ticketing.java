package com.project.gongyeon2jo.ticketing.domain;


import jdk.jshell.Snippet;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "ticketing")
public class Ticketing {
    @Id
    @Column(name = "ticketing_id")
    private String ticketingId;

    private String email;

    private String phonenumber;

    private String credit;

    @Column(name = "left_credit")
    private String leftCredit;

    @Column(name = "performance_id")
    private String performanceId;


}