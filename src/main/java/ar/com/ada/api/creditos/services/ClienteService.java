package ar.com.ada.api.creditos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.creditos.entities.*;
import ar.com.ada.api.creditos.repos.ClienteRepository;

///Se crea un service con la funcionalidad de traer todos los clientes y de grabar un cliente.

@Service
public class ClienteService {
 
    @Autowired
    ClienteRepository repo;

    public List<Cliente> buscarTodos() {

        return repo.findAll();

    }

    public void crearCliente(Cliente cliente) {

        repo.save(cliente);
    }

}
