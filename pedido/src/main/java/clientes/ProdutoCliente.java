package clientes;

import dtos.ProdutoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient("produto")
public interface ProdutoCliente {

    @GetMapping("/produtos")
    ResponseEntity<List<ProdutoDTO>> getProdutos();


}
