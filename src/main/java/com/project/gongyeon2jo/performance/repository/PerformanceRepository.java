package com.project.gongyeon2jo.performance.repository;

import com.project.gongyeon2jo.performance.entity.Performance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerformanceRepository extends JpaRepository<Performance, Integer> { // table명

    // 공연 목록
    List<Performance> findAll() ;
}
