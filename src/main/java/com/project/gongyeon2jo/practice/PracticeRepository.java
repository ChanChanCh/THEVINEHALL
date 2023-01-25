package com.project.gongyeon2jo.practice;

import com.project.gongyeon2jo.performance.entity.Performance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PracticeRepository extends JpaRepository<Practice, Integer> {
    List<Practice> findAll() ;
}