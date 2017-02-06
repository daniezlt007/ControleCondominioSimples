/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controle.modelo;

/**
 *
 * @author Daniel
 */
public class Banco {
    
    private Integer codBanco;
    private Integer codCompensacao;
    private String nomeBanco;
    private String siteBanco;
    
    public Banco(){
        
    }

    public Banco(Integer codBanco) {
        this.codBanco = codBanco;
    }
    
    public Banco(Integer codBanco, Integer codCompensacao, String nomeBanco, String siteBanco) {
        this.codBanco = codBanco;
        this.codCompensacao = codCompensacao;
        this.nomeBanco = nomeBanco;
        this.siteBanco = siteBanco;
    }

    public Integer getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(Integer codBanco) {
        this.codBanco = codBanco;
    }

    public Integer getCodCompensacao() {
        return codCompensacao;
    }

    public void setCodCompensacao(Integer codCompensacao) {
        this.codCompensacao = codCompensacao;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getSiteBanco() {
        return siteBanco;
    }

    public void setSiteBanco(String siteBanco) {
        this.siteBanco = siteBanco;
    }
    
}
