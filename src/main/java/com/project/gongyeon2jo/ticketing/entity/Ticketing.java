package com.project.gongyeon2jo.ticketing.entity;

import com.project.gongyeon2jo.performance.entity.Performance;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Ticketing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int ticketingId; // id
    String price;
    int ticketingQuantity;
    LocalDate ticketingDate;

    @ManyToOne
    @JoinColumn(name ="performance_id")
    private Performance performance;

    String userId;

}
