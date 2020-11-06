package br.uniso.tarefa.tarefa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CarroRepository cr;

    public void salvar(Carro carro) {
        cr.save(carro);
    }

    public void deletar(int id) { cr.deleteById(id); }

    public List<Carro> listarTodos() {
        return cr.findAll();
    }

    public Carro obterCarro(int id) { return cr.findById(id).get(); }

}
