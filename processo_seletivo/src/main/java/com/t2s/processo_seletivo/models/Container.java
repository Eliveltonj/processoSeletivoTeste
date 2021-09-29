package com.t2s.processo_seletivo.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
@Table(
        name = "CONTAINERS",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"cliente","numeroDoContainer"})}
)
public class Container {
    @GeneratedValue
    @Id
    private int id;
    @Column(nullable = false, length = 30)
    private String cliente;
    @Column(nullable = false, length = 11)
    @Pattern(regexp = "[A-Z]{4}+[0-9]{7}$", message = "O padrão permitido é 4 letras e 7 numeros")
    private String numeroDoContainer;
    @Column(nullable = false, length = 2)
    private int tipo;
    @Column(nullable = false, length = 5)
    private String status;
    @Column(nullable = false, length = 10)
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
