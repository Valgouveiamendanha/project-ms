package br.project.infnet.cliente.resources;

import br.project.infnet.cliente.Entidades.Cliente;
import br.project.infnet.cliente.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;


    @GetMapping
    public ResponseEntity<Iterable<Cliente>> getClientes(){
        try{
            return ResponseEntity.ok(clienteService.getAll());
        } catch (Exception ex) {
            Cliente cliente =  new Cliente();
            return (ResponseEntity<Iterable<Cliente>>) ResponseEntity.status(500);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Cliente> save(@RequestBody Cliente cliente) throws SQLException {
        clienteService.save(cliente);
        return new ResponseEntity<>(cliente, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Cliente>> getById(@PathVariable Long id) throws SQLException {
        return ResponseEntity.ok(clienteService.getById(id));
    }
}
