package br.project.infnet.clientes.services;

import br.project.infnet.clientes.Entidades.Cliente;
import br.project.infnet.clientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Iterable<Cliente> getAll(){
        return (Iterable<Cliente>) clienteRepository.findAll();
    }

    public Optional<Cliente> getById(Long id){
        return clienteRepository.findById(id);
    }
    public void save(Cliente cliente){
        clienteRepository.save( cliente);
    }
}
