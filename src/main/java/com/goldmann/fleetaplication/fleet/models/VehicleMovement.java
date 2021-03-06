package com.goldmann.fleetaplication.fleet.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.goldmann.fleetaplication.parameters.models.Location;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class VehicleMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @ManyToOne
    @JoinColumn(name="vehicleid", insertable=false, updatable=false)
    private Vehicle vehicle;
    private int vehicleid;

    @ManyToOne
    @JoinColumn(name="locationid1", insertable=false, updatable=false)
    private Location location1;
    private int locationid1;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate date1;

    @ManyToOne
    @JoinColumn(name="locationid2", insertable=false, updatable=false)
    private Location location2;
    private int locationid2;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate date2;

    private String remarks;
}
