package nl.spotbooking.spotbooking.service;

import nl.spotbooking.spotbooking.exception.RecordNotFoundException;
import nl.spotbooking.spotbooking.model.Seat;
import nl.spotbooking.spotbooking.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatServiceImpl implements SeatService{

    @Autowired
    private SeatRepository seatRepository;

    @Override
    public List<Seat> getAllSeats() {
        return seatRepository.findAll();
    }

    @Override
    public Seat getSeat(long id) {
        if (seatRepository.existsById(id)) {
            return seatRepository.findById(id).orElse(null);
        } else {
            throw new RecordNotFoundException("No seat found with this id"  + id);
        }
    }

    @Override
    public void save(Seat seat) {
        seatRepository.save(seat);
    }

    @Override
    public void deleteById(long id) {
        if (seatRepository.existsById(id)) {
            seatRepository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No seat found with this id"  + id);
        }
    }


}
