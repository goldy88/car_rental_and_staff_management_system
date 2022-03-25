package com.goldmann.fleetaplication.fleet.repositories;

import com.goldmann.fleetaplication.fleet.models.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {
}
