/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controle.dao;

import java.util.List;
import com.controle.modelo.Condominio;

/**
 *
 * @author Daniel
 */
public interface CondominioDAO {
    
        public void salvar(Condominio condominio);

	public Condominio buscarPeloCodigo(Integer codigo);

	public List<Condominio> buscarTodos();

	public Condominio buscarPeloNome(String nome);
        
        public void atualizar(Condominio condominio);
        
        public void excluir(Condominio condominio);
        
        public Condominio anterior(Integer codigo);
        
}
