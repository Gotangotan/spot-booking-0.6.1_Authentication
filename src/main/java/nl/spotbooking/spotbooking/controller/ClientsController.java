package nl.spotbooking.spotbooking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClientsController {
    @GetMapping(value=  "/clients")
    public ResponseEntity<Object> getClients() {
        List<String> data = new ArrayList<>();
        data.add("Jan");
        data.add("Piet");
        data.add("Joris");
        return new ResponseEntity<Object>(data, HttpStatus.OK);
    }
}
