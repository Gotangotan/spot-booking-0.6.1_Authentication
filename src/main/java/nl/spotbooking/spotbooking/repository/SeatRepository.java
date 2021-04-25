package nl.spotbooking.spotbooking.repository;

import nl.spotbooking.spotbooking.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SeatRepository extends JpaRepository<Seat, Long> {

}
