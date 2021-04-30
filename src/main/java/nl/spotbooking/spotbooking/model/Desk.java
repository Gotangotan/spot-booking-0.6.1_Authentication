package nl.spotbooking.spotbooking.model;

import javax.persistence.*;

@Entity
public class Desk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String Desk;

    @Column
    private String Availability;

    @ManyToOne
    private Date date;

//Getters and Setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
