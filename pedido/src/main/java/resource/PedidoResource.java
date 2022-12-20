package resource;


import clientes.ProdutoCliente;
import dtos.ProdutoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ProdutoCliente produtoCliente;


    @GetMapping
    public ResponseEntity<List<ProdutoDTO>>  efetuaPedido() {
      ResponseEntity<List<ProdutoDTO>> produtos = produtoCliente.getProdutos();
        return produtos;
    }

}


