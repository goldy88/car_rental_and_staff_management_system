package com.goldmann.fleetaplication.parameters.repositories;

import com.goldmann.fleetaplication.parameters.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
