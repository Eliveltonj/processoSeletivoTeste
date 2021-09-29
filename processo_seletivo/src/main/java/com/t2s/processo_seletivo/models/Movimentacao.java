package com.t2s.processo_seletivo.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(
        name = "MOVIMENTACOES",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"dataHoraInicio", "container"}),
                @UniqueConstraint(columnNames = {"dataHoraFim", "container"})
        }
)
public class Movimentacao {
    @GeneratedValue
    @Id
    private int id;
    @Column(nullable = false, length = 15)
    private String tipoDeMovimentacao;
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date dataHoraInicio;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraFim;
    @ManyToOne
    @JoinColumn(name = "container", nullable = false)
    private Container container;

    public Movimentacao(int id, String tipoDeMovimentacao, Date dataHoraInicio, Date dataHoraFim, Container container) {
        this.id = id;
        this.tipoDeMovimentacao = tipoDeMovimentacao;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.container = container;
    }

    public String getTipoDeMovimentacao() {
        return tipoDeMovimentacao;
    }

    public int getId() {
        return id;
    }

    public Container getContainer() {
        return container;
    }

    public Date getDataHoraInicio() {
        return dataHoraInicio;
    }

    public Date getDataHoraFim() {
        return dataHoraFim;
    }
    public void setTipoDeMovimentacao(String tipoDeMovimentacao) {
        this.tipoDeMovimentacao = tipoDeMovimentacao;
    }

    public void setDataHoraInicio(Date dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public void setDataHoraFim(Date dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setContainer(Container container) {
        this.container = container;
    }
}
