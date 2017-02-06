/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlecondominio.dao;

import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class DAOException extends RuntimeException {

    public DAOException(String erro_ao_inserir, SQLException e) {
        System.out.println("Erro de SQL: ");
    }
    
}
