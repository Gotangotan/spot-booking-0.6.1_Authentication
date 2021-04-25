package nl.spotbooking.spotbooking.model;

//POJO - Plain Old Java Object

import javax.persistence.*;

@Entity
public class Seat {

    // attributen die overeenkomen met de columns in PostgreSQL/SpotBooking/Table/Columns

    //PrimaryKey
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String Desk;

    @Column
    private String Availability;


    //getters and setters

    public String getDesk() {
        return Desk;
    }

    public void setDesk(String desk) {
        Desk = desk;
    }

    public String getAvailability() {
        return Availability;
    }

    public void setAvailability(String availability) {
        Availability = availability;
    }
}
