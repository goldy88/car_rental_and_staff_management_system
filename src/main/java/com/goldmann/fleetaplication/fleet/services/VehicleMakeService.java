package com.goldmann.fleetaplication.fleet.services;

import com.goldmann.fleetaplication.fleet.models.VehicleMake;
import com.goldmann.fleetaplication.fleet.repositories.VehicleMakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleMakeService {

    @Autowired
    private VehicleMakeRepository vehicleMakeRepository;

    //všechny vozidla
    public List<VehicleMake> findAll(){
        return vehicleMakeRepository.findAll();
    }

    //vozidla dle ID
    public VehicleMake getById(Integer id) {
        return vehicleMakeRepository.findById(id).orElse(null);
    }

    //vymazat vozidla
    public void delete(Integer id) {
        vehicleMakeRepository.deleteById(id);
    }

    //Uprava vozidel
    public void save(VehicleMake vehicleMake) {
        vehicleMakeRepository.save(vehicleMake);
    }

}
