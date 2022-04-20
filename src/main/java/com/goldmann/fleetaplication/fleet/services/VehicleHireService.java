package com.goldmann.fleetaplication.fleet.services;

import com.goldmann.fleetaplication.fleet.models.VehicleHire;
import com.goldmann.fleetaplication.fleet.repositories.VehicleHireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


public class VehicleHireService {

    @Autowired
    private VehicleHireRepository vehicleHireRepository;

    /**
     * metoda která vrací list pronajatých vozidel
     * @return vrací list všech pronajatých vozidel
     */
    public List<VehicleHire> findAll(){
        return vehicleHireRepository.findAll();
    }

    /**
     * Metoda pro vyhledání vozidla dle ID.
     * @param id ID pro vyhledání vozidla
     * @return záznam podle ID
     */
    public VehicleHire getById(Integer id) {
        return vehicleHireRepository.findById(id).orElse(null);
    }

    /**
     * metoda pro vymazání vozidle podle ID
     * @param id pro smazání záznamu podle ID
     */
    public void delete(Integer id) {
        vehicleHireRepository.deleteById(id);
    }

    /**
     * metoda pro uložení změny v pronájmu
     * @param vehicleHire parametetr pro objednávku
     */
    public void save(VehicleHire vehicleHire) {
        vehicleHireRepository.save(vehicleHire);
    }

}
