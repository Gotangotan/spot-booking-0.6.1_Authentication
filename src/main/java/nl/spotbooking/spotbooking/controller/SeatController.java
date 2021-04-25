package nl.spotbooking.spotbooking.controller;
import nl.spotbooking.spotbooking.model.Seat;

import nl.spotbooking.spotbooking.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SeatController {

    @Autowired
    private SeatService seatService;

    @GetMapping(value="/seats")
    public ResponseEntity<Object> getSeats() {
        List<Seat> seats = seatService.getAllSeats();
        return new ResponseEntity<>(seats, HttpStatus.OK);
    }

    @GetMapping(value="/seats/{id}")
    public ResponseEntity<Object> getSeat(@PathVariable("id") long id){
        return new ResponseEntity<>(seatService.getSeat(id),HttpStatus.OK);
    }

    @PostMapping(value="/seats")
    public ResponseEntity<Object> createSeat(@RequestBody Seat seat){
        seatService.save(seat);
        return new ResponseEntity<>("Seat Created",HttpStatus.CREATED);
    }

    @DeleteMapping (value="/seats/{id}")
    public ResponseEntity<Object> deleteSeat(@PathVariable("id") long id){
        seatService.deleteById(id);
        return new ResponseEntity<>("Seat deleted", HttpStatus.OK);
    }

}
