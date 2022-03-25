package com.goldmann.fleetaplication.fleet.services;

import com.goldmann.fleetaplication.fleet.models.VehicleHire;
import com.goldmann.fleetaplication.fleet.repositories.VehicleHireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleHireService {

    @Autowired
    private VehicleHireRepository vehicleHireRepository;

    //všechny vozidla
    public List<VehicleHire> findAll(){
        return vehicleHireRepository.findAll();
    }

    //vozidla dle ID
    public VehicleHire getById(Integer id) {
        return vehicleHireRepository.findById(id).orElse(null);
    }

    //vymazat vozidla
    public void delete(Integer id) {
        vehicleHireRepository.deleteById(id);
    }

    //Uprava vozidel
    public void save(VehicleHire vehicleHire) {
        vehicleHireRepository.save(vehicleHire);
    }

}
