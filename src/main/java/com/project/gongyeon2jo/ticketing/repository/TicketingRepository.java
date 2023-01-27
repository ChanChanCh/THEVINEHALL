package com.project.gongyeon2jo.ticketing.repository;

import com.project.gongyeon2jo.ticketing.entity.Ticketing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketingRepository extends JpaRepository<Ticketing, Integer> { // table명

}

