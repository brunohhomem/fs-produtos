package br.com.api.produtos.controle;

import br.com.api.produtos.modelo.ProdutoModelo;
import br.com.api.produtos.servico.ProdutoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoControle {

  @Autowired private ProdutoServico ps;

  @GetMapping("/listar")
  public Iterable<ProdutoModelo> listar(){
    return ps.listar();
  }

  @PostMapping("/cadastrar")
  public ResponseEntity<?> cadastrar(@RequestBody ProdutoModelo pm){
    return ps.cadastrar(pm);
  }

}
