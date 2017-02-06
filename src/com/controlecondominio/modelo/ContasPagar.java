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
public class ContasPagar {
    
    private Integer codigo;
    private Integer codConta;
    private Integer codCondominio;
    private Integer codFornecedor;
    private String notaFiscal;
    private Double vlrNota;
    private Double vlrJuro;
    private Double vlrMulta;
    private Double vlrPago;
    private Integer numeroCheque;
    private String chequeNominal;
    private Date dataEmissao;
    private Date dataEntrada;
    private Date dataVencimento;
    private Date dataLancamento;
    private Date dataPagamento;
    private Date dataCheque;
    private String mesAno;
    
    public ContasPagar(){
        
    }

    public ContasPagar(Integer codigo) {
        this.codigo = codigo;
    }

    public ContasPagar(Integer codigo, Integer codConta, Integer codCondominio, Integer codFornecedor, String notaFiscal, Double vlrNota, Double vlrJuro, Double vlrMulta, Double vlrPago, Integer numeroCheque, String chequeNominal, Date dataEmissao, Date dataEntrada, Date dataVencimento, Date dataLancamento, Date dataPagamento, Date dataCheque, String mesAno) {
        this.codigo = codigo;
        this.codConta = codConta;
        this.codCondominio = codCondominio;
        this.codFornecedor = codFornecedor;
        this.notaFiscal = notaFiscal;
        this.vlrNota = vlrNota;
        this.vlrJuro = vlrJuro;
        this.vlrMulta = vlrMulta;
        this.vlrPago = vlrPago;
        this.numeroCheque = numeroCheque;
        this.chequeNominal = chequeNominal;
        this.dataEmissao = dataEmissao;
        this.dataEntrada = dataEntrada;
        this.dataVencimento = dataVencimento;
        this.dataLancamento = dataLancamento;
        this.dataPagamento = dataPagamento;
        this.dataCheque = dataCheque;
        this.mesAno = mesAno;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodConta() {
        return codConta;
    }

    public void setCodConta(Integer codConta) {
        this.codConta = codConta;
    }

    public Integer getCodCondominio() {
        return codCondominio;
    }

    public void setCodCondominio(Integer codCondominio) {
        this.codCondominio = codCondominio;
    }

    public Integer getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(Integer codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Double getVlrNota() {
        return vlrNota;
    }

    public void setVlrNota(Double vlrNota) {
        this.vlrNota = vlrNota;
    }

    public Double getVlrJuro() {
        return vlrJuro;
    }

    public void setVlrJuro(Double vlrJuro) {
        this.vlrJuro = vlrJuro;
    }

    public Double getVlrMulta() {
        return vlrMulta;
    }

    public void setVlrMulta(Double vlrMulta) {
        this.vlrMulta = vlrMulta;
    }

    public Double getVlrPago() {
        return vlrPago;
    }

    public void setVlrPago(Double vlrPago) {
        this.vlrPago = vlrPago;
    }

    public Integer getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(Integer numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public String getChequeNominal() {
        return chequeNominal;
    }

    public void setChequeNominal(String chequeNominal) {
        this.chequeNominal = chequeNominal;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Date getDataCheque() {
        return dataCheque;
    }

    public void setDataCheque(Date dataCheque) {
        this.dataCheque = dataCheque;
    }

    public String getMesAno() {
        return mesAno;
    }

    public void setMesAno(String mesAno) {
        this.mesAno = mesAno;
    }
            
}
