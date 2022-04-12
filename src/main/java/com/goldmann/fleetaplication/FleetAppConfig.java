package com.goldmann.fleetaplication;


import com.goldmann.fleetaplication.fleet.models.*;
import com.goldmann.fleetaplication.fleet.services.*;
import com.goldmann.fleetaplication.parameters.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FleetAppConfig {

    @Bean
    public ClientService clientService(){
        return new ClientService();
    }

    @Bean
    public ContactService contactService(){
        return new ContactService();
    }

    @Bean
    public CountryService countryService(){
        return new CountryService();
    }

    @Bean
    public DepartmentService departmentService(){
        return new DepartmentService();
    }

    @Bean
    public LocationService locationService(){
        return new LocationService();
    }

    @Bean
    public StateService stateService(){
        return new StateService();
    }

    @Bean
    public SupplierService supplierService(){
        return new SupplierService();
    }

    @Bean
    public VehicleHireService vehicleHireService(){
        return new VehicleHireService();
    }

    @Bean
    public VehicleMaintenanceService vehicleMaintenanceService(){
        return new VehicleMaintenanceService();
    }

    @Bean
    public VehicleMake vehicleMake(){
        return new VehicleMake();
    }

    @Bean
    public VehicleModel vehicleModel(){
        return new VehicleModel();
    }

    @Bean
    public VehicleMovement vehicleMovement(){
        return new VehicleMovement();
    }

    @Bean
    public VehicleService vehicleService(){
        return new VehicleService();
    }

    @Bean
    public VehicleStatusService vehicleStatusService(){
        return new VehicleStatusService();
    }

    @Bean
    public VehicleTypeService vehicleTypeService(){
        return new VehicleTypeService();
    }





}



