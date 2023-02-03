package com.project.gongyeon2jo.ticketing.repository;

import com.project.gongyeon2jo.ticketing.model.Ticketing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketingRepository extends JpaRepository<Ticketing, String> {

    Ticketing save(Ticketing ticketing);

    @Query(value = "select seats from ticketing where performance_id = :performanceId", nativeQuery = true)
    List<String> getTicketedSeats(@Param(value = "performanceId") Integer performanceId);
}


