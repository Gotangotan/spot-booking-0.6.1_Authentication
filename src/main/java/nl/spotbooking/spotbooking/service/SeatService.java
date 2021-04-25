package nl.spotbooking.spotbooking.service;

import nl.spotbooking.spotbooking.model.Seat;

import java.util.List;


public interface SeatService {

     List<Seat> getAllSeats();
     Seat getSeat(long id);
     void save(Seat seat);
     void deleteById(long id);
}
