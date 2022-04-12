package com.goldmann.fleetaplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.logging.Logger;


@SpringBootApplication
public class FleetAplicationApplication {

    private static final Logger LOGGER = Logger.getLogger(FleetAplicationApplication.class.getName());


    public static void main(String[] args) {
        SpringApplication.run(FleetAplicationApplication.class, args);


        LOGGER.info("Starting app: "+ LOGGER.getName());




    }

}
