/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlecondominio.modelo;

/**
 *
 * @author Daniel
 */
public class CentroCusto {
    
    private Integer codConta;
    private String descricaoConta;
    
    public CentroCusto(){
        
    }
    
    public CentroCusto(Integer codConta){
        this.codConta = codConta;
    }

    public CentroCusto(Integer codConta, String descricaoConta) {
        this.codConta = codConta;
        this.descricaoConta = descricaoConta;
    }

    public Integer getCodConta() {
        return codConta;
    }

    public void setCodConta(Integer codConta) {
        this.codConta = codConta;
    }

    public String getDescricaoConta() {
        return descricaoConta;
    }

    public void setDescricaoConta(String descricaoConta) {
        this.descricaoConta = descricaoConta;
    }
   
}
