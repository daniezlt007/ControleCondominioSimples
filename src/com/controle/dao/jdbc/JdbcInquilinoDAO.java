/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controle.dao.jdbc;

import com.controle.dao.InquilinoDAO;
import com.controle.modelo.Inquilino;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class JdbcInquilinoDAO implements InquilinoDAO {
    private final Connection connection;
    int idcond;
    String nomecond;
	public JdbcInquilinoDAO(Connection connection){
		this.connection = connection;
	}

    @Override
    public void salvar(Inquilino inquilino) {
        try {
            String sql = "insert into inquilino(condominio_cod_cond,apto_inq,bloco_inq, "
                    + "nome_inq,fone_inq,celular_inq,vlr_cota_normal_inq, fracao_ideal_inq,"
                    + "cpf_inq) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = this.connection.prepareStatement(sql);
            ps.setString(1, inquilino.getCodCondominio());
            ps.setString(2, inquilino.getApto());
            ps.setString(3, inquilino.getBloco());
            ps.setString(4, inquilino.getNomeInquilino());
            ps.setString(5, inquilino.getFoneInquilino());
            ps.setString(6, inquilino.getCelularInquilino());
            ps.setDouble(7, inquilino.getCotaNormal());
            ps.setDouble(8, inquilino.getFracaoIdeal());
            ps.setString(9, inquilino.getCpfInquilino());
            
        } catch (SQLException e) {
        }
 
    }

    @Override
    public Inquilino buscarPeloCodigo(Integer codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Inquilino> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Inquilino buscarPeloNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Inquilino inquilino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Inquilino inquilino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Inquilino anterior(Integer codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
