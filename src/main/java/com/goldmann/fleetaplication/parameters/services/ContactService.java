package com.goldmann.fleetaplication.parameters.services;

import com.goldmann.fleetaplication.parameters.models.Contact;
import com.goldmann.fleetaplication.parameters.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> findAll(){
        return contactRepository.findAll();
    }

    public void save(Contact contact){
        contactRepository.save(contact);
    }

    public void delete(Integer id){
        contactRepository.deleteById(id);
    }

    public Contact getById(Integer id) {
        return contactRepository.findById(id).orElse(null);
    }
}

