package com.goldmann.fleetaplication.parameters.controlers;

import com.goldmann.fleetaplication.parameters.models.Contact;
import com.goldmann.fleetaplication.parameters.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class ContactController {

   @Autowired
    private ContactService contactService;


    @GetMapping("/parameters/contacts")
    public String findAll(Model model) {
        List<Contact> contacts = contactService.findAll();
        model.addAttribute("contacts", contacts);
        return "/parameters/contacts";
    }


    @GetMapping("/contactAdd")
    public String addContact(Model model) {
        model.addAttribute("contacts", contactService.findAll());
        return "/parameters/contactAdd";
    }

    @GetMapping("/contactEdit/{id}")
    public String editContact(@PathVariable Integer id, Model model) {
        Contact contact = contactService.getById(id);
        model.addAttribute("contact", contact);
        return "/parameters/contactEdit";
    }

    @GetMapping("/contactDetails/{id}")
    public String detailsContact(@PathVariable Integer id, Model model) {
        Contact contact = contactService.getById(id);
        model.addAttribute("contact", contact);
        return "/parameters/contactDetails";
    }

    @PostMapping("/contacts")
    public String save(Contact contact) {
        contactService.save(contact);
        return "redirect:/parameters/contacts";
    }

    @RequestMapping(value = "/contacts/delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public String delete(@PathVariable Integer id) {
        contactService.delete(id);
        return "redirect:/parameters/contacts";
    }

    @RequestMapping(value = "/contacts/update/{id}", method = {RequestMethod.GET,RequestMethod.PUT})
    public String update(Contact contact){
        contactService.save(contact);
        return "redirect:/parameters/contacts";
    }

}
