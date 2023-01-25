package com.project.gongyeon2jo.practice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PracticeRepository2 extends JpaRepository<Practice2, Integer> {

}