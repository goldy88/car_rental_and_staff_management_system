package com.goldmann.fleetaplication.fleet.controllers;


import com.goldmann.fleetaplication.fleet.models.Vehicle;
import com.goldmann.fleetaplication.fleet.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;


    @GetMapping("/fleet/vehicles")
    public String getAll(Model model){
        List<Vehicle> vehicles = vehicleService.findAll();
        model.addAttribute("vehicles", vehicles);
        return "/fleet/vehicles";
    }




}
