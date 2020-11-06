package br.uniso.tarefa.tarefa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carro", schema="linguagensinternet")
public class Carro {
    @Id
    @Column(name="id_carro")
    private int id;

    @Column(name="modelo")
    private String modelo;

    @Column(name="cor")
    private String cor;

    @Column(name="potencia")
    private int potencia;

    public int getId_carro() {
        return id;
    }

    public void setId_carro(int id_carro) {
        this.id = id_carro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }


}
