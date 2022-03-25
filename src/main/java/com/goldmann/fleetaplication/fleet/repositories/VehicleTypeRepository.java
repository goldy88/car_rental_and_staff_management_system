package com.goldmann.fleetaplication.fleet.repositories;

import com.goldmann.fleetaplication.fleet.models.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleTypeRepository extends JpaRepository <VehicleType,Integer> {
}
