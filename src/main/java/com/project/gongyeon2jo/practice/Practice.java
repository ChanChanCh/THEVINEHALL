package com.project.gongyeon2jo.practice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Practice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int practiceId; // id
    String displayName;
    int price;

}