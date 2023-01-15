package com.project.gongyeon2jo.show.repository;

import com.project.gongyeon2jo.show.entity.Performance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerformanceRepository extends JpaRepository<Performance, String> { // table명

    List<Performance> findAll();
}
