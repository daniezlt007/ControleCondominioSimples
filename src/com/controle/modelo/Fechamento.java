/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controle.modelo;

import java.util.Date;

/**
 *
 * @author Daniel
 */
public class Fechamento {
    
    private String nuMContrato;
    private Integer codFornecedor;
    private Integer codCondominio;
    private String contratReferente;
    private Date dataInicio;
    private Date dataFim;
    private Date diaVencimento;
    private Double vlrContrato;
    
    public Fechamento(){
        
    }

    public Fechamento(String nuMContrato) {
        this.nuMContrato = nuMContrato;
    }

    public Fechamento(String nuMContrato, Integer codFornecedor, Integer codCondominio, String contratReferente, Date dataInicio, Date dataFim, Date diaVencimento, Double vlrContrato) {
        this.nuMContrato = nuMContrato;
        this.codFornecedor = codFornecedor;
        this.codCondominio = codCondominio;
        this.contratReferente = contratReferente;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.diaVencimento = diaVencimento;
        this.vlrContrato = vlrContrato;
    }

    public String getNuMContrato() {
        return nuMContrato;
    }

    public void setNuMContrato(String nuMContrato) {
        this.nuMContrato = nuMContrato;
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

    public String getContratReferente() {
        return contratReferente;
    }

    public void setContratReferente(String contratReferente) {
        this.contratReferente = contratReferente;
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

    public Date getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(Date diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    public Double getVlrContrato() {
        return vlrContrato;
    }

    public void setVlrContrato(Double vlrContrato) {
        this.vlrContrato = vlrContrato;
    }
    
}
