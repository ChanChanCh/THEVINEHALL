package com.project.gongyeon2jo.show.repository;

import com.project.gongyeon2jo.show.entity.Performance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import java.util.List;

@Repository
public interface PerformanceRepository extends JpaRepository<Performance, String> { // table명

    List<Performance> findAll();
=======
@Repository
public interface PerformanceRepository extends JpaRepository<Performance, String> { // table명


>>>>>>> parent of 964b28c (Revert "포스터 파일명 커밋")
}
