package br.project.infnet.cliente.repository;

import br.project.infnet.cliente.Entidades.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends CrudRepository <Cliente, Long> {
}
