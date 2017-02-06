/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controle.modelo;

/**
 *
 * @author Daniel 
 * classe modelo condominio 
 */
public class Condominio {
    
    private Integer codCondominio;
    private String nomeCondominio;
    private String enderecoCondominio;
    private String bairroCondominio;
    private String cidadeCondominio;
    private String ufCondominio;
    private String cepCondominio;
    private String foneCondominio;
    private String cnpjCondominio;
    private String emailCondominio;
    private String sindicoCondominio;
    private String instrucao1;
    private String instrucao2;
    private String instrucao3;
    private String instrucao4;
    private Double moraCondominio;
    private Double multaCondominio;
    private Double rateioCondominio;
    private String diaVencimento;
    
    
    public Condominio(){
        
    }
    public Condominio(Integer codCondominio){
        this.codCondominio = codCondominio;
    }

    public Condominio(Integer codCondominio, String nomeCondominio, String enderecoCondominio, String bairroCondominio, String cidadeCondominio, String ufCondominio, String cepCondominio, String foneCondominio, String cnpjCondominio, String emailCondominio, String sindicoCondominio, String instrucao1, String instrucao2, String instrucao3, String instrucao4, Double moraCondominio, Double multaCondominio, Double rateioCondominio, String diaVencimento) {
        this.codCondominio = codCondominio;
        this.nomeCondominio = nomeCondominio;
        this.enderecoCondominio = enderecoCondominio;
        this.bairroCondominio = bairroCondominio;
        this.cidadeCondominio = cidadeCondominio;
        this.ufCondominio = ufCondominio;
        this.cepCondominio = cepCondominio;
        this.foneCondominio = foneCondominio;
        this.cnpjCondominio = cnpjCondominio;
        this.emailCondominio = emailCondominio;
        this.sindicoCondominio = sindicoCondominio;
        this.instrucao1 = instrucao1;
        this.instrucao2 = instrucao2;
        this.instrucao3 = instrucao3;
        this.instrucao4 = instrucao4;
        this.moraCondominio = moraCondominio;
        this.multaCondominio = multaCondominio;
        this.rateioCondominio = rateioCondominio;
        this.diaVencimento = diaVencimento;
    }

    public Integer getCodCondominio() {
        return codCondominio;
    }

    public void setCodCondominio(Integer codCondominio) {
        this.codCondominio = codCondominio;
    }

    public String getNomeCondominio() {
        return nomeCondominio;
    }

    public void setNomeCondominio(String nomeCondominio) {
        this.nomeCondominio = nomeCondominio;
    }

    public String getEnderecoCondominio() {
        return enderecoCondominio;
    }

    public void setEnderecoCondominio(String enderecoCondominio) {
        this.enderecoCondominio = enderecoCondominio;
    }

    public String getBairroCondominio() {
        return bairroCondominio;
    }

    public void setBairroCondominio(String bairroCondominio) {
        this.bairroCondominio = bairroCondominio;
    }

    public String getCidadeCondominio() {
        return cidadeCondominio;
    }

    public void setCidadeCondominio(String cidadeCondominio) {
        this.cidadeCondominio = cidadeCondominio;
    }

    public String getUfCondominio() {
        return ufCondominio;
    }

    public void setUfCondominio(String ufCondominio) {
        this.ufCondominio = ufCondominio;
    }

    public String getCepCondominio() {
        return cepCondominio;
    }

    public void setCepCondominio(String cepCondominio) {
        this.cepCondominio = cepCondominio;
    }

    public String getFoneCondominio() {
        return foneCondominio;
    }

    public void setFoneCondominio(String foneCondominio) {
        this.foneCondominio = foneCondominio;
    }

    public String getCnpjCondominio() {
        return cnpjCondominio;
    }

    public void setCnpjCondominio(String cnpjCondominio) {
        this.cnpjCondominio = cnpjCondominio;
    }

    public String getEmailCondominio() {
        return emailCondominio;
    }

    public void setEmailCondominio(String emailCondominio) {
        this.emailCondominio = emailCondominio;
    }

    public String getSindicoCondominio() {
        return sindicoCondominio;
    }

    public void setSindicoCondominio(String sindicoCondominio) {
        this.sindicoCondominio = sindicoCondominio;
    }

    public String getInstrucao1() {
        return instrucao1;
    }

    public void setInstrucao1(String instrucao1) {
        this.instrucao1 = instrucao1;
    }

    public String getInstrucao2() {
        return instrucao2;
    }

    public void setInstrucao2(String instrucao2) {
        this.instrucao2 = instrucao2;
    }

    public String getInstrucao3() {
        return instrucao3;
    }

    public void setInstrucao3(String instrucao3) {
        this.instrucao3 = instrucao3;
    }

    public String getInstrucao4() {
        return instrucao4;
    }

    public void setInstrucao4(String instrucao4) {
        this.instrucao4 = instrucao4;
    }

    public Double getMoraCondominio() {
        return moraCondominio;
    }

    public void setMoraCondominio(Double moraCondominio) {
        this.moraCondominio = moraCondominio;
    }

    public Double getMultaCondominio() {
        return multaCondominio;
    }

    public void setMultaCondominio(Double multaCondominio) {
        this.multaCondominio = multaCondominio;
    }

    public Double getRateioCondominio() {
        return rateioCondominio;
    }

    public void setRateioCondominio(Double rateioCondominio) {
        this.rateioCondominio = rateioCondominio;
    }

    public String getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(String diaVencimento) {
        this.diaVencimento = diaVencimento;
    }
    
    
}
