package com.goldmann.fleetaplication.parameters.services;

import com.goldmann.fleetaplication.parameters.models.Client;
import com.goldmann.fleetaplication.parameters.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> findAll(){
        return clientRepository.findAll();
    }

    public void save(Client contact){
        clientRepository.save(contact);
    }

    public void delete(Integer id){
        clientRepository.deleteById(id);
    }

    public Client getById(Integer id) {
        return clientRepository.findById(id).orElse(null);
    }
}
