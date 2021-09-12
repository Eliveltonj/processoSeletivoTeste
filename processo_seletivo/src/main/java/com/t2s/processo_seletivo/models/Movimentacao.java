package com.t2s.processo_seletivo.models;

import java.util.Date;

public class Movimentacao {
    private int id;
    private String tipoDeMovimentacao;
    private Date dataHoraInicio;
    private Date dataHoraFim;
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
