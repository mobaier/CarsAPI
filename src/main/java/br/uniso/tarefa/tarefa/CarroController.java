package br.uniso.tarefa.tarefa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarroController {

    @Autowired
    private CarroService service;

    @GetMapping("/carros")
    public List<Carro> listaCarros() { return service.listarTodos(); }

    @PostMapping("/carros")
    public void adicionar(@RequestBody Carro carro) { service.salvar(carro);}

    @PutMapping("/carros/{id_carro}")
    public ResponseEntity<?> atualizar(@RequestBody Carro carro, @PathVariable Integer id) {
        Carro existente = service.obterCarro(id);

        if(existente != null) {
            service.salvar(carro);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
