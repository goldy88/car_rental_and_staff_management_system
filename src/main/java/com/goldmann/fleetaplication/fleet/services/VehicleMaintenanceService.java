package com.goldmann.fleetaplication.fleet.services;

import com.goldmann.fleetaplication.fleet.models.VehicleMaintenance;
import com.goldmann.fleetaplication.fleet.repositories.VehicleMaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleMaintenanceService {

    @Autowired
    private VehicleMaintenanceRepository vehicleMaintenanceRepository;


    public List<VehicleMaintenance> findAll(){
        return vehicleMaintenanceRepository.findAll();
    }


    public VehicleMaintenance getById(Integer id) {
        return vehicleMaintenanceRepository.findById(id).orElse(null);
    }


    public void delete(Integer id) {
        vehicleMaintenanceRepository.deleteById(id);
    }


    public void save(VehicleMaintenance vehicleMaintenance) {
        vehicleMaintenanceRepository.save(vehicleMaintenance);
    }
}
