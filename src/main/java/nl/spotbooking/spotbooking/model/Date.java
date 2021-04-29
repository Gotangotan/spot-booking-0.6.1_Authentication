package nl.spotbooking.spotbooking.model;

//POJO - Plain Old Java Object

import javax.persistence.*;

@Entity
public class Date {

    // attributen die overeenkomen met de columns in PostgreSQL/SpotBooking/Table/Columns

    //PrimaryKey
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String Date;

    @Column
    private String Availability;


    //getters and setters

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getAvailability() {
        return Availability;
    }

    public void setAvailability(String availability) {
        Availability = availability;
    }
}
