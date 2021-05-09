package nl.spotbooking.spotbooking.repository;

import nl.spotbooking.spotbooking.model.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DateRepository extends JpaRepository<Date, Long> {

}
