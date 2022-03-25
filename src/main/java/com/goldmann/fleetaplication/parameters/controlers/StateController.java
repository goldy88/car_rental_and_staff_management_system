package com.goldmann.fleetaplication.parameters.controlers;


import com.goldmann.fleetaplication.parameters.models.State;
import com.goldmann.fleetaplication.parameters.services.CountryService;
import com.goldmann.fleetaplication.parameters.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class StateController {

    @Autowired
    private StateService stateService;
    @Autowired
    private CountryService countryService;

    public  Model addModelAttributes(Model model){
        model.addAttribute("states", stateService.findAll());
        model.addAttribute("countries", countryService.findAll());
        return model;
    }


        @GetMapping("/parameters/states")
    public String findAll(Model model){
        addModelAttributes(model);
        return "/parameters/states";
    }



    @GetMapping("/stateAdd")
    public String addState(Model model) {
        model.addAttribute("states", stateService.findAll());
        model.addAttribute("countries", countryService.findAll());
        return "/parameters/stateAdd";
    }

    @GetMapping("/stateEdit/{id}")
    public String editState(@PathVariable Integer id, Model model) {
        State state = stateService.getById(id);
        model.addAttribute("state", state);
        return "/parameters/stateEdit";
    }

    @GetMapping("/stateDetails/{id}")
    public String detailsState(@PathVariable Integer id, Model model) {
        State state = stateService.getById(id);
        model.addAttribute("state", state);
        return "/parameters/stateDetails";
    }

    @PostMapping("/states")
    public String save(State state){
        stateService.save(state);
        return "redirect:/parameters/states";
    }

    @RequestMapping(value = "/states/delete/{id}", method = {RequestMethod.GET,RequestMethod.DELETE})
    public String delete(@PathVariable Integer id){
        stateService.delete(id);
        return "redirect:/parameters/states";
    }

    @RequestMapping(value = "/states/update/{id}", method = {RequestMethod.GET,RequestMethod.PUT})
    public String update(State state){
        stateService.save(state);
        return "redirect:/parameters/states";
    }


}
