package com.goldmann.fleetaplication.fleet.services;


import com.goldmann.fleetaplication.fleet.models.VehicleType;
import com.goldmann.fleetaplication.fleet.repositories.VehicleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class VehicleTypeService {

    @Autowired
    VehicleTypeRepository vehicleTypeRepository;


    public List<VehicleType> findAll(){
        return vehicleTypeRepository.findAll();
    }

    public VehicleType getById(Integer id){
        return vehicleTypeRepository.findById(id).orElse(null);
    }

    public void delete(Integer id){
        vehicleTypeRepository.deleteById(id);
    }

    public void save(VehicleType vehicleType){
        vehicleTypeRepository.save(vehicleType);
    }

}
