package com.goldmann.fleetaplication.fleet.repositories;

import com.goldmann.fleetaplication.fleet.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
