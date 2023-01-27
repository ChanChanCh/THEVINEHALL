package com.project.gongyeon2jo.ticketing.model;

import com.project.gongyeon2jo.performance.entity.Performance;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data // getter, setter 사용
public class TicketingInput {

    String price;
    int ticketingQuantity;
    LocalDate ticketingDate;
    /*performanceId는 외래키로 가져옴*/
    String userId;

}
