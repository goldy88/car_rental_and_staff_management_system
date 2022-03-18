package com.goldmann.fleetaplication.parameters.repositories;

import com.goldmann.fleetaplication.parameters.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
