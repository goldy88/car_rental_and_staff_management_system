package com.goldmann.fleetaplication.parameters.repositories;

import com.goldmann.fleetaplication.parameters.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
}
