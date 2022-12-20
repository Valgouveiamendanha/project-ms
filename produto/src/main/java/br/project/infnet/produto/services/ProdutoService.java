package br.project.infnet.produto.services;

import br.project.infnet.produto.entidades.Produto;
import br.project.infnet.produto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;


    public Iterable<Produto> getAll(){
        return (Iterable<Produto>) produtoRepository.findAll();
    }
}
