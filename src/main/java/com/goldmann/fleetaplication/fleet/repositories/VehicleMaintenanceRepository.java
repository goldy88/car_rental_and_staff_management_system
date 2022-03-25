package com.goldmann.fleetaplication.fleet.repositories;


import com.goldmann.fleetaplication.fleet.models.VehicleMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMaintenanceRepository extends JpaRepository<VehicleMaintenance, Integer> {
}
