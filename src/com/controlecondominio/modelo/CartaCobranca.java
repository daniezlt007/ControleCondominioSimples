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
public class CartaCobranca {
       
    private Integer codCarta;
    private String codInquilino;
    private String assuntoCarta;
    private Date envio1;
    private Date envio2;
    private Date envio3;
    private Date envio4;
    private Date envio5;
    private String numProcesso;
    private Date dataProcesso;
    private String advogadoProcesso;
    private String textoCarta;
    
    public CartaCobranca(){
        
    }
    
    public CartaCobranca(Integer codCarta){
        this.codCarta = codCarta;
    }

    public CartaCobranca(Integer codCarta, String codInquilino, String assuntoCarta, Date envio1, Date envio2, Date envio3, Date envio4, Date envio5, String numProcesso, Date dataProcesso, String advogadoProcesso, String textoCarta) {
        this.codCarta = codCarta;
        this.codInquilino = codInquilino;
        this.assuntoCarta = assuntoCarta;
        this.envio1 = envio1;
        this.envio2 = envio2;
        this.envio3 = envio3;
        this.envio4 = envio4;
        this.envio5 = envio5;
        this.numProcesso = numProcesso;
        this.dataProcesso = dataProcesso;
        this.advogadoProcesso = advogadoProcesso;
        this.textoCarta = textoCarta;
    }

    public Integer getCodCarta() {
        return codCarta;
    }

    public void setCodCarta(Integer codCarta) {
        this.codCarta = codCarta;
    }

    public String getCodInquilino() {
        return codInquilino;
    }

    public void setCodInquilino(String codInquilino) {
        this.codInquilino = codInquilino;
    }

    public String getAssuntoCarta() {
        return assuntoCarta;
    }

    public void setAssuntoCarta(String assuntoCarta) {
        this.assuntoCarta = assuntoCarta;
    }

    public Date getEnvio1() {
        return envio1;
    }

    public void setEnvio1(Date envio1) {
        this.envio1 = envio1;
    }

    public Date getEnvio2() {
        return envio2;
    }

    public void setEnvio2(Date envio2) {
        this.envio2 = envio2;
    }

    public Date getEnvio3() {
        return envio3;
    }

    public void setEnvio3(Date envio3) {
        this.envio3 = envio3;
    }

    public Date getEnvio4() {
        return envio4;
    }

    public void setEnvio4(Date envio4) {
        this.envio4 = envio4;
    }

    public Date getEnvio5() {
        return envio5;
    }

    public void setEnvio5(Date envio5) {
        this.envio5 = envio5;
    }

    public String getNumProcesso() {
        return numProcesso;
    }

    public void setNumProcesso(String numProcesso) {
        this.numProcesso = numProcesso;
    }

    public Date getDataProcesso() {
        return dataProcesso;
    }

    public void setDataProcesso(Date dataProcesso) {
        this.dataProcesso = dataProcesso;
    }

    public String getAdvogadoProcesso() {
        return advogadoProcesso;
    }

    public void setAdvogadoProcesso(String advogadoProcesso) {
        this.advogadoProcesso = advogadoProcesso;
    }

    public String getTextoCarta() {
        return textoCarta;
    }

    public void setTextoCarta(String textoCarta) {
        this.textoCarta = textoCarta;
    }
    
    
    
}
