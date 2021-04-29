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
    Date date;



}
