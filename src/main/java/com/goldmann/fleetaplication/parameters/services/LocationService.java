package com.goldmann.fleetaplication.parameters.services;


import com.goldmann.fleetaplication.parameters.models.Location;
import com.goldmann.fleetaplication.parameters.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public List<Location> findAll(){
        return locationRepository.findAll();
    }

    public void save(Location location){
        locationRepository.save(location);
    }

    public void delete(Integer id){
        locationRepository.deleteById(id);
    }

    public Location getById(Integer id) {
        return locationRepository.findById(id).orElse(null);
    }
}
