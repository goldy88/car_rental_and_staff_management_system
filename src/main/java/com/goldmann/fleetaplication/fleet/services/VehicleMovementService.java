package com.goldmann.fleetaplication.fleet.services;


import com.goldmann.fleetaplication.fleet.models.VehicleMovement;
import com.goldmann.fleetaplication.fleet.repositories.VehicleMovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VehicleMovementService {



    @Autowired
    VehicleMovementRepository vehicleMovementRepository;

    public List<VehicleMovement> findAll(){
        return vehicleMovementRepository.findAll();
    }

    public VehicleMovement getById(Integer id){
        return vehicleMovementRepository.getById(id);
    }

    public void delete(Integer id){
        vehicleMovementRepository.deleteById(id);
    }

    public void save(VehicleMovement vehicleMovement){
        vehicleMovementRepository.save(vehicleMovement);
    }

}






