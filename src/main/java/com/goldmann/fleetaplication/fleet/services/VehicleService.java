package com.goldmann.fleetaplication.fleet.services;

import com.goldmann.fleetaplication.fleet.models.Vehicle;
import com.goldmann.fleetaplication.fleet.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    public List<Vehicle> findAll(){
        return vehicleRepository.findAll();
    }

    public Vehicle getById(Integer id){
        return vehicleRepository.getById(id);
    }

    public void delete(Integer id){
        vehicleRepository.deleteById(id);
    }

    public void save(Vehicle vehicle){
        vehicleRepository.save(vehicle);
    }

}
