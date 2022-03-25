package com.goldmann.fleetaplication;


import com.goldmann.fleetaplication.parameters.models.Country;
import com.goldmann.fleetaplication.parameters.repositories.CountryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CountryTest {


    @Autowired
    private CountryRepository repository;


    //FindById
    @Test
    public void testFindId() {
        Country country = repository.getById(2);
        assertNotNull(country);
    }


    //FindByIdEmpty
    @Test
    public void testFindIdEmpty() {
        Country country = repository.getById(1);
        assertNull(country);
    }
}
