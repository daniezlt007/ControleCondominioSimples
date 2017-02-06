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
public class Movimento {
    
    private Integer codMovimento;
    private Integer codCentroCusto;
    private Integer codCondominio;
    private String mesAno;
    private Integer numCheque;
    private String descricao;
    private String numDocumento;
    private Double vlrDocumento;
    private Date dataLancto;
    private Date dataCheque;

    public Movimento() {
    
    }

    public Movimento(Integer codMovimento) {
        this.codMovimento = codMovimento;
    }

    public Movimento(Integer codMovimento, Integer codCentroCusto, Integer codCondominio, String mesAno, Integer numCheque, String descricao, String numDocumento, Double vlrDocumento, Date dataLancto, Date dataCheque) {
        this.codMovimento = codMovimento;
        this.codCentroCusto = codCentroCusto;
        this.codCondominio = codCondominio;
        this.mesAno = mesAno;
        this.numCheque = numCheque;
        this.descricao = descricao;
        this.numDocumento = numDocumento;
        this.vlrDocumento = vlrDocumento;
        this.dataLancto = dataLancto;
        this.dataCheque = dataCheque;
    }

    public Integer getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(Integer codMovimento) {
        this.codMovimento = codMovimento;
    }

    public Integer getCodCentroCusto() {
        return codCentroCusto;
    }

    public void setCodCentroCusto(Integer codCentroCusto) {
        this.codCentroCusto = codCentroCusto;
    }

    public Integer getCodCondominio() {
        return codCondominio;
    }

    public void setCodCondominio(Integer codCondominio) {
        this.codCondominio = codCondominio;
    }

    public String getMesAno() {
        return mesAno;
    }

    public void setMesAno(String mesAno) {
        this.mesAno = mesAno;
    }

    public Integer getNumCheque() {
        return numCheque;
    }

    public void setNumCheque(Integer numCheque) {
        this.numCheque = numCheque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public Double getVlrDocumento() {
        return vlrDocumento;
    }

    public void setVlrDocumento(Double vlrDocumento) {
        this.vlrDocumento = vlrDocumento;
    }

    public Date getDataLancto() {
        return dataLancto;
    }

    public void setDataLancto(Date dataLancto) {
        this.dataLancto = dataLancto;
    }

    public Date getDataCheque() {
        return dataCheque;
    }

    public void setDataCheque(Date dataCheque) {
        this.dataCheque = dataCheque;
    }
    
}
