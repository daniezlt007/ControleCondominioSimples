/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlecondominio.modelo;

import java.util.Date;

/**
 *
 * @author Daniel
 */
public class ContratoFornecedor {
    
    private String numContrato;
    private Integer codFornecedor;
    private Integer codCondominio;
    private String contratoReferente;
    private Date dataInicio;
    private Date dataFim;
    private String diaVencimento;
    private Double vlrContrato;

    public ContratoFornecedor() {
    
    }

    public ContratoFornecedor(String numContrato) {
        this.numContrato = numContrato;
    }

    public ContratoFornecedor(String numContrato, Integer codFornecedor, Integer codCondominio, String contratoReferente, Date dataInicio, Date dataFim, String diaVencimento, Double vlrContrato) {
        this.numContrato = numContrato;
        this.codFornecedor = codFornecedor;
        this.codCondominio = codCondominio;
        this.contratoReferente = contratoReferente;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.diaVencimento = diaVencimento;
        this.vlrContrato = vlrContrato;
    }

    public String getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(String numContrato) {
        this.numContrato = numContrato;
    }

    public Integer getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(Integer codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public Integer getCodCondominio() {
        return codCondominio;
    }

    public void setCodCondominio(Integer codCondominio) {
        this.codCondominio = codCondominio;
    }

    public String getContratoReferente() {
        return contratoReferente;
    }

    public void setContratoReferente(String contratoReferente) {
        this.contratoReferente = contratoReferente;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(String diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    public Double getVlrContrato() {
        return vlrContrato;
    }

    public void setVlrContrato(Double vlrContrato) {
        this.vlrContrato = vlrContrato;
    }
    
}
