package com.project.gongyeon2jo.practice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Practice2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int practice2Id; // id

    int ticketQuantity;

    @ManyToOne
    @JoinColumn(name ="practice_id")
    private Practice practice;
}