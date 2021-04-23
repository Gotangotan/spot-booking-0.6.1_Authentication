package nl.spotbooking.spotbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpotBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpotBookingApplication.class, args);
	}
	@GetMapping(value="/")
	public String getDemo() {
		return "Hello World";
	}
	@GetMapping(value="/grap")
	public String getGrap() {
		return "Hoe vangt een konijn een koe";
	}
}
