package com.goldmann.fleetaplication.fleet.services;

import com.goldmann.fleetaplication.fleet.models.VehicleModel;
import com.goldmann.fleetaplication.fleet.repositories.VehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleModelService {

    @Autowired
    VehicleModelRepository vehicleModelRepository;

    public List<VehicleModel> findAll(){
        return vehicleModelRepository.findAll();
    }

    public VehicleModel getById(Integer id){
        return vehicleModelRepository.getById(id);
    }

    public void delete(Integer id){
        vehicleModelRepository.deleteById(id);
    }

    public void save(VehicleModel vehicleModel){
        vehicleModelRepository.save(vehicleModel);
    }


}
