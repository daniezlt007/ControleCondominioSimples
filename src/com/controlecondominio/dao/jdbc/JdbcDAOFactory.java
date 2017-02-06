/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlecondominio.dao.jdbc;

import com.controlecondominio.dao.CondominioDAO;
import com.controlecondominio.dao.DAOFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class JdbcDAOFactory extends DAOFactory{
    
    private Connection connection;
    
    public JdbcDAOFactory(){
		try {
		Class.forName("com.mysql.jdbc.Driver");
		this.connection = DriverManager.getConnection("jdbc:mysql://localhost/syndic","root","root");
		} catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException("Erro ao recuperar conexão!", e);
		}
	}
    
    @Override
    public CondominioDAO getCondominioDAO() {
        return new JdbcCondominioDAO(connection);
    }
    
    
}
