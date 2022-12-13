package br.project.infnet.clientes.repository;

import br.project.infnet.clientes.Entidades.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository <Cliente, Long> {
}
