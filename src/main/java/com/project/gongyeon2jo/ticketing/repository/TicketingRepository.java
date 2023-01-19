package com.project.gongyeon2jo.ticketing.repository;

import com.project.gongyeon2jo.ticketing.domain.Ticketing;
import com.project.gongyeon2jo.ticketing.dto.TicketingDto;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;


public interface TicketingRepository extends JpaRepository<Ticketing, String> {

   //List<Ticketing> findAll();
   //Ticketing getTicketingByTicketingId(String ticketingId);




}