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
public class Fornecedor {
    
    private Integer codFornecedor;
    private String nomeFornecedor;
    private String endereco;
    private String bairro;
    private String cep;
    private String fone;
    private String celular;
    private String email;
    private String site;
    private String cnpj;
    
    public Fornecedor(){
        
    }
    
    public Fornecedor(Integer codFornecedor){
        this.codFornecedor = codFornecedor;
    }

    public Fornecedor(Integer codFornecedor, String nomeFornecedor, String endereco, String bairro, String cep, String fone, String celular, String email, String site, String cnpj) {
        this.codFornecedor = codFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.fone = fone;
        this.celular = celular;
        this.email = email;
        this.site = site;
        this.cnpj = cnpj;
    }

    public Integer getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(Integer codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
