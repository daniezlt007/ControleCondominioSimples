/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controle.dao;

import com.controle.dao.jdbc.JdbcDAOFactory;

/**
 *
 * @author Daniel
 */
public abstract class DAOFactory {
	
	public static DAOFactory getDAOFactory(){
		return new JdbcDAOFactory();
	}
	
	public abstract CondominioDAO getCondominioDAO();
        
        public abstract InquilinoDAO getInquilinoDAO();
}

