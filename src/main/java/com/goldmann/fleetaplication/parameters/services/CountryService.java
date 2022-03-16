package com.goldmann.fleetaplication.parameters.services;


import com.goldmann.fleetaplication.parameters.models.Country;
import com.goldmann.fleetaplication.parameters.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> findAll(){
        return countryRepository.findAll();
    }

    public void save(Country country){
        countryRepository.save(country);
    }

    public void delete(Integer id){
        countryRepository.deleteById(id);
    }

    public Country getById(Integer id) {
        return countryRepository.findById(id).orElse(null);
    }
}
