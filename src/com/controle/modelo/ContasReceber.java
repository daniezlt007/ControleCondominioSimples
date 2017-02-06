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
public class ContasReceber {
    
    private Integer codigo;
    private Integer codCondominio;
    private String codInquilino;
    private String mesAno;
    private Date vencimento;
    private Double cotaNormal;
    private Double cotaExtra;
    private Double mora;
    private Double multa;
    private Double gas;
    private Double receber;
    private Double taxaDesconto;
    private Double vlrDesconto;
    private Double recebido;
    private String houveCotaExtra;
    private String motivoCotaExtra;
    private String tipoRecebimento;
    private Date dataRecebimento;

    public ContasReceber() {
    
    }
    
    public ContasReceber(Integer codigo) {
        this.codigo = codigo;
    }
    
    public ContasReceber(Integer codigo, Integer codCondominio, String codInquilino, String mesAno, Date vencimento, Double cotaNormal, Double cotaExtra, Double mora, Double multa, Double gas, Double receber, Double taxaDesconto, Double vlrDesconto, Double recebido, String houveCotaExtra, String motivoCotaExtra, String tipoRecebimento, Date dataRecebimento) {
        this.codigo = codigo;
        this.codCondominio = codCondominio;
        this.codInquilino = codInquilino;
        this.mesAno = mesAno;
        this.vencimento = vencimento;
        this.cotaNormal = cotaNormal;
        this.cotaExtra = cotaExtra;
        this.mora = mora;
        this.multa = multa;
        this.gas = gas;
        this.receber = receber;
        this.taxaDesconto = taxaDesconto;
        this.vlrDesconto = vlrDesconto;
        this.recebido = recebido;
        this.houveCotaExtra = houveCotaExtra;
        this.motivoCotaExtra = motivoCotaExtra;
        this.tipoRecebimento = tipoRecebimento;
        this.dataRecebimento = dataRecebimento;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodCondominio() {
        return codCondominio;
    }

    public void setCodCondominio(Integer codCondominio) {
        this.codCondominio = codCondominio;
    }

    public String getCodInquilino() {
        return codInquilino;
    }

    public void setCodInquilino(String codInquilino) {
        this.codInquilino = codInquilino;
    }

    public String getMesAno() {
        return mesAno;
    }

    public void setMesAno(String mesAno) {
        this.mesAno = mesAno;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public Double getCotaNormal() {
        return cotaNormal;
    }

    public void setCotaNormal(Double cotaNormal) {
        this.cotaNormal = cotaNormal;
    }

    public Double getCotaExtra() {
        return cotaExtra;
    }

    public void setCotaExtra(Double cotaExtra) {
        this.cotaExtra = cotaExtra;
    }

    public Double getMora() {
        return mora;
    }

    public void setMora(Double mora) {
        this.mora = mora;
    }

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public Double getGas() {
        return gas;
    }

    public void setGas(Double gas) {
        this.gas = gas;
    }

    public Double getReceber() {
        return receber;
    }

    public void setReceber(Double receber) {
        this.receber = receber;
    }

    public Double getTaxaDesconto() {
        return taxaDesconto;
    }

    public void setTaxaDesconto(Double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }

    public Double getVlrDesconto() {
        return vlrDesconto;
    }

    public void setVlrDesconto(Double vlrDesconto) {
        this.vlrDesconto = vlrDesconto;
    }

    public Double getRecebido() {
        return recebido;
    }

    public void setRecebido(Double recebido) {
        this.recebido = recebido;
    }

    public String getHouveCotaExtra() {
        return houveCotaExtra;
    }

    public void setHouveCotaExtra(String houveCotaExtra) {
        this.houveCotaExtra = houveCotaExtra;
    }

    public String getMotivoCotaExtra() {
        return motivoCotaExtra;
    }

    public void setMotivoCotaExtra(String motivoCotaExtra) {
        this.motivoCotaExtra = motivoCotaExtra;
    }

    public String getTipoRecebimento() {
        return tipoRecebimento;
    }

    public void setTipoRecebimento(String tipoRecebimento) {
        this.tipoRecebimento = tipoRecebimento;
    }

    public Date getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(Date dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    } 
    
}
