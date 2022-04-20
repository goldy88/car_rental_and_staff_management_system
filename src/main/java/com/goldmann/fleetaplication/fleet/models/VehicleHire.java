package com.goldmann.fleetaplication.fleet.models;

import com.goldmann.fleetaplication.parameters.models.Client;
import com.goldmann.fleetaplication.parameters.models.Location;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleHire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @ManyToOne
    @JoinColumn(name="vehicleid", insertable=false, updatable=false)
    private Vehicle vehicle;
    private Integer vehicleid;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateOut;

    private String timeOut;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateIn;

    private String timeIn;

    @ManyToOne
    @JoinColumn(name="clientid", insertable=false, updatable=false)
    private Client client;
    private Integer clientid;

    @ManyToOne
    @JoinColumn(name="locationid", insertable=false, updatable=false)
    private Location location;
    private Integer locationid;

    private String price;

    private String remarks;
}
