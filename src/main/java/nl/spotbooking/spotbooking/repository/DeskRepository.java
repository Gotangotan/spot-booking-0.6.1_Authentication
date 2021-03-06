package nl.spotbooking.spotbooking.repository;

import nl.spotbooking.spotbooking.model.Desk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeskRepository extends JpaRepository<Desk, Long> {

}
