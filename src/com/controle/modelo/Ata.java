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
public class Ata {
    
    private Integer codAta;
    private Integer codCondominio;
    private String numeroAta;
    private String assuntoAta;
    private Date dataReuniao;
    private Date dataRegistro;
    private String textoAta;
    
    public Ata(){
        
    }
    
    public Ata(Integer codAta){
        this.codAta = codAta;
    }

    public Ata(Integer codAta, Integer codCondominio, String numeroAta, String assuntoAta, Date dataReuniao, Date dataRegistro, String textoAta) {
        this.codAta = codAta;
        this.codCondominio = codCondominio;
        this.numeroAta = numeroAta;
        this.assuntoAta = assuntoAta;
        this.dataReuniao = dataReuniao;
        this.dataRegistro = dataRegistro;
        this.textoAta = textoAta;
    }

    public Integer getCodAta() {
        return codAta;
    }

    public void setCodAta(Integer codAta) {
        this.codAta = codAta;
    }

    public Integer getCodCondominio() {
        return codCondominio;
    }

    public void setCodCondominio(Integer codCondominio) {
        this.codCondominio = codCondominio;
    }

    public String getNumeroAta() {
        return numeroAta;
    }

    public void setNumeroAta(String numeroAta) {
        this.numeroAta = numeroAta;
    }

    public String getAssuntoAta() {
        return assuntoAta;
    }

    public void setAssuntoAta(String assuntoAta) {
        this.assuntoAta = assuntoAta;
    }

    public Date getDataReuniao() {
        return dataReuniao;
    }

    public void setDataReuniao(Date dataReuniao) {
        this.dataReuniao = dataReuniao;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getTextoAta() {
        return textoAta;
    }

    public void setTextoAta(String textoAta) {
        this.textoAta = textoAta;
    }
    
}
