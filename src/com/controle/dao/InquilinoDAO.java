/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controle.dao;


import com.controle.modelo.Inquilino;
import java.util.List;

/**
 *
 * @author Daniel
 */
public interface InquilinoDAO {
    public void salvar(Inquilino inquilino);

	public Inquilino buscarPeloCodigo(Integer codigo);

	public List<Inquilino> buscarTodos();

	public Inquilino buscarPeloNome(String nome);
        
        public void atualizar(Inquilino inquilino);
        
        public void excluir(Inquilino inquilino);
        
        public Inquilino anterior(Integer codigo);
}
