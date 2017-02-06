/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controle.modelo;

/**
 *
 * @author Daniel
 * @Classe Morador
 */
public class Inquilino {
    
    private Integer codInquilino;
    private String codCondominio;
    private String nomeCondominio;
    private String apto;
    private String bloco;
    private String nomeInquilino;
    private String foneInquilino;
    private String celularInquilino;
    private String cpfInquilino;
    private Double cotaNormal;
    private Double fracaoIdeal;
    
    public Inquilino(){
        
    }
    
    public Inquilino(Integer codInquilino){
        this.codInquilino = codInquilino;
    }

    public Inquilino(Integer codInquilino, String codCondominio, String nomeCondominio, String apto, String bloco, String nomeInquilino, String foneInquilino, String celularInquilino, String cpfInquilino, Double cotaNormal, Double fracaoIdeal) {
        this.codInquilino = codInquilino;
        this.codCondominio = codCondominio;
        this.nomeCondominio = nomeCondominio;
        this.apto = apto;
        this.bloco = bloco;
        this.nomeInquilino = nomeInquilino;
        this.foneInquilino = foneInquilino;
        this.celularInquilino = celularInquilino;
        this.cpfInquilino = cpfInquilino;
        this.cotaNormal = cotaNormal;
        this.fracaoIdeal = fracaoIdeal;
    }

    public Integer getCodInquilino() {
        return codInquilino;
    }

    public void setCodInquilino(Integer codInquilino) {
        this.codInquilino = codInquilino;
    }

    public String getCodCondominio() {
        return codCondominio;
    }

    public void setCodCondominio(String codCondominio) {
        this.codCondominio = codCondominio;
    }

    public String getNomeCondominio() {
        return nomeCondominio;
    }

    public void setNomeCondominio(String nomeCondominio) {
        this.nomeCondominio = nomeCondominio;
    }

    public String getApto() {
        return apto;
    }

    public void setApto(String apto) {
        this.apto = apto;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getNomeInquilino() {
        return nomeInquilino;
    }

    public void setNomeInquilino(String nomeInquilino) {
        this.nomeInquilino = nomeInquilino;
    }

    public String getFoneInquilino() {
        return foneInquilino;
    }

    public void setFoneInquilino(String foneInquilino) {
        this.foneInquilino = foneInquilino;
    }

    public String getCelularInquilino() {
        return celularInquilino;
    }

    public void setCelularInquilino(String celularInquilino) {
        this.celularInquilino = celularInquilino;
    }

    public String getCpfInquilino() {
        return cpfInquilino;
    }

    public void setCpfInquilino(String cpfInquilino) {
        this.cpfInquilino = cpfInquilino;
    }

    public Double getCotaNormal() {
        return cotaNormal;
    }

    public void setCotaNormal(Double cotaNormal) {
        this.cotaNormal = cotaNormal;
    }

    public Double getFracaoIdeal() {
        return fracaoIdeal;
    }

    public void setFracaoIdeal(Double fracaoIdeal) {
        this.fracaoIdeal = fracaoIdeal;
    }
    
}