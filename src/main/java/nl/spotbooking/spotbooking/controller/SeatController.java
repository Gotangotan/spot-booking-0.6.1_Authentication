package nl.spotbooking.spotbooking.controller;
import nl.spotbooking.spotbooking.model.Seat;

import nl.spotbooking.spotbooking.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SeatController {

    @Autowired
    private SeatRepository seatRepository;

    @GetMapping(value="/seats")
    public ResponseEntity<Object> getSeats() {
        List<Seat> seats = seatRepository.findAll();
        return new ResponseEntity<>(seats, HttpStatus.OK);
    }

    @GetMapping(value="/seats/{id}")
    public ResponseEntity<Optional<Seat>> getSeat(@PathVariable("id") long id){
        return new ResponseEntity<>(seatRepository.findById(id),HttpStatus.OK);
    }

}
