package com.goldmann.fleetaplication.parameters.services;

import com.goldmann.fleetaplication.parameters.models.Supplier;
import com.goldmann.fleetaplication.parameters.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> findAll(){
        return supplierRepository.findAll();
    }

    public void save(Supplier contact){
        supplierRepository.save(contact);
    }

    public void delete(Integer id){
        supplierRepository.deleteById(id);
    }

    public Supplier getById(Integer id) {
        return supplierRepository.findById(id).orElse(null);
    }
}

