package com.project.gongyeon2jo.ticketing.service;

import com.project.gongyeon2jo.ticketing.model.Seat;
import com.project.gongyeon2jo.ticketing.repository.TicketingRepository;
import com.project.gongyeon2jo.ticketing.model.Ticketing;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketingService {

    private final TicketingRepository ticketingRepository;

    @Transactional
    public void insert(Ticketing ticketing) {
        ticketing.setTicketingDate(LocalDateTime.now());
        ticketingRepository.save(ticketing);
    }

    @Transactional
    public List<List<String>> getSeatInfo(Integer performanceId) {
        Seat seat = new Seat();
        List<List<String>> allSeats = seat.getAllSeats();
        List<String> ticketedSeats = this.getTicketedSeats(performanceId);

        for (List<String> row : allSeats) {
            for (int i = 0; i < row.size(); i++) {
                if (ticketedSeats.contains(row.get(i))) {
                    row.set(i, "X");
                }
            }
        }

        return allSeats;
    }

    @Transactional
    public List<String> getTicketedSeats(Integer performanceId) {
        List<String> result = new ArrayList<>();

        List<String> ticketedSeatList = ticketingRepository.getTicketedSeats(performanceId);
        for (String ticketedSeat : ticketedSeatList) {
            List<String> splitted = Arrays.asList(ticketedSeat.split(","));
            result.addAll(splitted);
        }

        return result;
    }


}
