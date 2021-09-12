package com.t2s.processo_seletivo.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(
        name = "CONTAINERS",
        uniqueConstraints =
)
public class Container {
    private int id;
    private String cliente;
    private String numeroDoContainer;
    private int tipo;
    private String status;
    private String categoria;

    public Container(int id, String cliente, String numeroDoContainer, int tipo, String status, String categoria) {
        this.id = id;
        this.cliente = cliente;
        this.numeroDoContainer = numeroDoContainer;
        this.tipo = tipo;
        this.status = status;
        this.categoria = categoria;
    }

    public int getId(){
        return this.id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getNumeroDoContainer() {
        return numeroDoContainer;
    }

    public int getTipo() {
        return tipo;
    }

    public String getStatus() {
        return status;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setNumeroDoContainer(String numeroDoContainer) {
        this.numeroDoContainer = numeroDoContainer;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
