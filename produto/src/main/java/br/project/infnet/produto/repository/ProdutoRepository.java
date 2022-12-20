package br.project.infnet.produto.repository;

import br.project.infnet.produto.entidades.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}
