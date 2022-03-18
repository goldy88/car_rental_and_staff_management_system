package com.goldmann.fleetaplication.parameters.controlers;

import com.goldmann.fleetaplication.parameters.models.Supplier;
import com.goldmann.fleetaplication.parameters.services.ClientService;
import com.goldmann.fleetaplication.parameters.services.CountryService;
import com.goldmann.fleetaplication.parameters.services.StateService;
import com.goldmann.fleetaplication.parameters.services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class SupplierController {

    @Autowired
    private ClientService clientService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private StateService stateService;
    @Autowired
    private SupplierService supplierService;


    public Model addModelAttributes(Model model){
        model.addAttribute("clients", clientService.findAll());
        model.addAttribute("countries", countryService.findAll());
        model.addAttribute("states", stateService.findAll());
        model.addAttribute("suppliers", supplierService.findAll());
        return model;
    }



    @GetMapping("/parameters/suppliers")
    public String findAll(Model model){
        addModelAttributes(model);
        return "/parameters/suppliers";
    }

    @GetMapping("/supplierAdd")
    public String addSupplier(Model model) {
        model.addAttribute("countries", countryService.findAll());
        return "/parameters/supplierAdd";
    }

    @GetMapping("/supplierEdit/{id}")
    public String editSupplier(@PathVariable Integer id, Model model) {
        Supplier supplier = supplierService.getById(id);
        model.addAttribute("supplier", supplier);
        addModelAttributes(model);
        return "/parameters/supplierEdit";
    }

    @GetMapping("/supplierDetails/{id}")
    public String detailsSupplier(@PathVariable Integer id, Model model) {
        Supplier supplier = supplierService.getById(id);
        model.addAttribute("supplier", supplier);
        addModelAttributes(model);
        return "/parameters/supplierDetails";
    }


    @PostMapping("/suppliers")
    public String save(Supplier supplier) {
        supplierService.save(supplier);
        return "redirect:/parameters/suppliers";
    }

    @RequestMapping(value = "/suppliers/delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public String delete(@PathVariable Integer id) {
        supplierService.delete(id);
        return "redirect:/parameters/suppliers";
    }

    @RequestMapping(value = "/supplier/update/{id}", method = {RequestMethod.GET,RequestMethod.PUT})
    public String update(Supplier supplier){
        supplierService.save(supplier);
        return "redirect:/parameters/suppliers";
    }

}
