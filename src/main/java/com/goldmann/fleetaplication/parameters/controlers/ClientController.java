package com.goldmann.fleetaplication.parameters.controlers;

import com.goldmann.fleetaplication.parameters.models.Client;
import com.goldmann.fleetaplication.parameters.services.ClientService;
import com.goldmann.fleetaplication.parameters.services.CountryService;
import com.goldmann.fleetaplication.parameters.services.StateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private StateService stateService;

    private static final Logger logger = LoggerFactory.getLogger(ClientController.class);

    public Model addModelAttributes(Model model){
        model.addAttribute("clients", clientService.findAll());
        model.addAttribute("countries", countryService.findAll());
        model.addAttribute("states", stateService.findAll());
        return model;
    }


    @GetMapping("/parameters/clients")
    public String findAll(Model model){

        addModelAttributes(model);
        return "/parameters/clients";
    }

    @GetMapping("/clientAdd")
    public String addClient(Model model) {
        model.addAttribute("countries", countryService.findAll());
        return "/parameters/clientAdd";
    }

    @GetMapping("/clientEdit/{id}")
    public String editClient(@PathVariable Integer id, Model model) {
        Client client = clientService.getById(id);
        model.addAttribute("client", client);
        addModelAttributes(model);
        return "/parameters/clientEdit";
    }

    @GetMapping("/clientDetails/{id}")
    public String detailsClient(@PathVariable Integer id, Model model) {
        Client client = clientService.getById(id);
        model.addAttribute("client", client);
        addModelAttributes(model);
        return "/parameters/clientDetails";
    }


    @PostMapping("/clients")
    public String save(Client client) {
        clientService.save(client);
        return "redirect:/parameters/clients";
    }

    @RequestMapping(value = "/clients/delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public String delete(@PathVariable Integer id) {
        clientService.delete(id);
        return "redirect:/parameters/clients";
    }

    @RequestMapping(value = "/client/update/{id}", method = {RequestMethod.GET,RequestMethod.PUT})
    public String update(Client client){
        clientService.save(client);
        return "redirect:/parameters/clients";
    }

}
