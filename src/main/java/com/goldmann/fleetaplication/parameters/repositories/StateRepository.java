package com.goldmann.fleetaplication.parameters.repositories;

import com.goldmann.fleetaplication.parameters.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {
}
