package com.goldmann.fleetaplication.fleet.services;



import com.goldmann.fleetaplication.fleet.models.VehicleStatus;
import com.goldmann.fleetaplication.fleet.repositories.VehicleStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleStatusService {

    @Autowired
    VehicleStatusRepository vehicleStatusRepository;

    public List<VehicleStatus> getAll(){
        return vehicleStatusRepository.findAll();
    }

    public VehicleStatus getById(Integer id){
        return vehicleStatusRepository.getById(id);
    }

    public void delete(Integer id){
        vehicleStatusRepository.deleteById(id);
    }

    public void save(VehicleStatus vehicleStatus){
        vehicleStatusRepository.save(vehicleStatus);
    }

}
