package com.goldmann.fleetaplication.parameters.repositories;

import com.goldmann.fleetaplication.parameters.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
