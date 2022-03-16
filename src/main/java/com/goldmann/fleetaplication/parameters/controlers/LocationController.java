package com.goldmann.fleetaplication.parameters.controlers;


import com.goldmann.fleetaplication.parameters.models.Location;
import com.goldmann.fleetaplication.parameters.services.CountryService;
import com.goldmann.fleetaplication.parameters.services.LocationService;
import com.goldmann.fleetaplication.parameters.services.StateService;
import com.goldmann.fleetaplication.parameters.services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;




@Controller
public class LocationController {

    @Autowired	private LocationService locationService;
    @Autowired	private CountryService countryService;
    @Autowired	private StateService stateService;
    @Autowired  private SupplierService supplierService;

    public Model addModelAttributes(Model model){
        model.addAttribute("locations", locationService.findAll());
        model.addAttribute("countries", countryService.findAll());
        model.addAttribute("states", stateService.findAll());
        model.addAttribute("suppliers", supplierService.findAll());
        return model;
    }

    @GetMapping("/parameters/locations")
    public String findAll(Model model){
        addModelAttributes(model);
        return "/parameters/locations";
    }

    @GetMapping("/locationAdd")
    public String addLocation(Model model){
        model.addAttribute("countries", countryService.findAll());
        return "parameters/locationAdd";
    }

    //The op parameter is either Edit or Details
    @GetMapping("/locationEdit/{id}")
    public String editLocation(@PathVariable Integer id, Model model){
        Location location = locationService.getById(id);
        model.addAttribute("location", location);
        addModelAttributes(model);
        return "/parameters/locationEdit";
    }

    @GetMapping("/locationDetails/{id}")
    public String detailsSupplier(@PathVariable Integer id, Model model) {
        Location location = locationService.getById(id);
        model.addAttribute("location", location);
        addModelAttributes(model);
        return "/parameters/locationDetails";
    }

    @PostMapping("/locations")
    public String save(Location location) {
        locationService.save(location);
        return "redirect:/parameters/locations";
    }

    @RequestMapping(value="/locations/delete/{id}", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(@PathVariable Integer id) {
        locationService.delete(id);
        return "redirect:/parameters/locations";
    }

    @RequestMapping(value = "/location/update/{id}", method = {RequestMethod.GET,RequestMethod.PUT})
    public String update(Location location){
        locationService.save(location);
        return "redirect:/parameters/locations";
    }

}
