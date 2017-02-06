/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controle.dao.jdbc;

import com.controle.dao.CondominioDAO;
import java.util.List;
import com.controle.modelo.Condominio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class JdbcCondominioDAO implements CondominioDAO{
    
    private final Connection connection;
	
	public JdbcCondominioDAO(Connection connection){
		this.connection = connection;
	}
	
	
    
    @Override
    public void salvar(Condominio condominio) {
        try {
			String sql = "insert into condominio(nome_cond,endereco_cond,bairro_cond,cidade_cond,"
                                + "uf_cond,cep_cond,fone_cond,cnpj_cond,email_cond,sindico_cond,"
                                + "instrucao1,instrucao2,instrucao3,instrucao4,mora_cond,"
                                + "multa_cond,rateio_cond,dia_vencimento_cond) values "
                                + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement ps = this.connection.prepareStatement(sql);
                        ps.setString(1,  condominio.getNomeCondominio());
                        ps.setString(2,  condominio.getEnderecoCondominio());
                        ps.setString(3,  condominio.getBairroCondominio());
                        ps.setString(4,  condominio.getCidadeCondominio());
                        ps.setString(5,  condominio.getUfCondominio());
                        ps.setString(6,  condominio.getCepCondominio());
                        ps.setString(7,  condominio.getFoneCondominio());
                        ps.setString(8,  condominio.getCnpjCondominio());
                        ps.setString(9,  condominio.getEmailCondominio());
                        ps.setString(10, condominio.getSindicoCondominio());
                        ps.setString(11, condominio.getInstrucao1());
                        ps.setString(12, condominio.getInstrucao2());
                        ps.setString(13, condominio.getInstrucao3());
                        ps.setString(14, condominio.getInstrucao4());
                        ps.setDouble(15, condominio.getMoraCondominio());
                        ps.setDouble(16, condominio.getMultaCondominio());
                        ps.setDouble(17, condominio.getRateioCondominio());
                        ps.setString(18, condominio.getDiaVencimento());
                        
			ps.executeUpdate();
			
		} catch (SQLException e) {
                    System.out.println("Erro: " + e.getMessage());
		}finally{
			try {
				this.connection.close();
			} catch (Exception e) {
                            System.err.println("Passou pelo finally: " + e.getMessage());
			}
		}
    }

    @Override
    public Condominio buscarPeloCodigo(Integer codigo) {
        Condominio condominio = new Condominio(codigo);
		try {
			String sql = "select cod_cond,nome_cond,endereco_cond,bairro_cond,cidade_cond,uf_cond,"
                                + "cep_cond,fone_cond,cnpj_cond,email_cond,sindico_cond,instrucao1,"
                                + "instrucao2,instrucao3,instrucao4,mora_cond,multa_cond,rateio_cond,"
                                + "dia_vencimento_cond from condominio where cod_cond=?";
			PreparedStatement ps = this.connection.prepareStatement(sql);
                        ps.setInt(1, condominio.getCodCondominio());
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				condominio = new Condominio();
				condominio.setCodCondominio(rs.getInt("cod_cond"));
				condominio.setNomeCondominio(rs.getString("nome_cond"));
                                condominio.setEnderecoCondominio(rs.getString("endereco_cond"));
                                condominio.setBairroCondominio(rs.getString("bairro_cond"));
                                condominio.setCidadeCondominio(rs.getString("cidade_cond"));
                                condominio.setUfCondominio(rs.getString("uf_cond"));
                                condominio.setCepCondominio(rs.getString("cep_cond"));
                                condominio.setFoneCondominio(rs.getString("fone_cond"));
                                condominio.setCnpjCondominio(rs.getString("cnpj_cond"));
                                condominio.setEmailCondominio(rs.getString("email_cond"));
                                condominio.setSindicoCondominio(rs.getString("sindico_cond"));
                                condominio.setInstrucao1(rs.getString("instrucao1"));
                                condominio.setInstrucao2(rs.getString("instrucao2"));
                                condominio.setInstrucao3(rs.getString("instrucao3"));
                                condominio.setInstrucao4(rs.getString("instrucao4"));
                                condominio.setMoraCondominio(rs.getDouble("mora_cond"));
                                condominio.setMultaCondominio(rs.getDouble("multa_cond"));
                                condominio.setRateioCondominio(rs.getDouble("rateio_cond"));
                                condominio.setDiaVencimento(rs.getString("dia_vencimento_cond"));
                                
			}
			
		} catch (SQLException e) {
			                 System.out.println("Erro: " + e.getMessage());
		}finally{
			try{
				this.connection.close();
			}catch(Exception e){}
		}
		return condominio;
    }
    
    
    @Override
    public void atualizar(Condominio condominio) {
        
        String sql = "update condominio set nome_cond=?,endereco_cond=?,bairro_cond=?,cidade_cond=?,uf_cond=?,cep_cond=?,"
                + "fone_cond=?,cnpj_cond=?,email_cond=?,sindico_cond=?,instrucao1=?,instrucao2=?,instrucao3=?,instrucao4=?,"
                + "mora_cond=?,multa_cond=?,rateio_cond=?,dia_vencimento_cond=? where cod_cond=?";
        try {
            PreparedStatement ps = this.connection.prepareStatement(sql);
                        
                        ps.setString(1, condominio.getNomeCondominio());
                        ps.setString(2,  condominio.getEnderecoCondominio());
                        ps.setString(3,  condominio.getBairroCondominio());
                        ps.setString(4,  condominio.getCidadeCondominio());
                        ps.setString(5,  condominio.getUfCondominio());
                        ps.setString(6,  condominio.getCepCondominio());
                        ps.setString(7,  condominio.getFoneCondominio());
                        ps.setString(8,  condominio.getCnpjCondominio());
                        ps.setString(9,  condominio.getEmailCondominio());
                        ps.setString(10,  condominio.getSindicoCondominio());
                        ps.setString(11, condominio.getInstrucao1());
                        ps.setString(12, condominio.getInstrucao2());
                        ps.setString(13, condominio.getInstrucao3());
                        ps.setString(14, condominio.getInstrucao4());
                        ps.setDouble(15, condominio.getMoraCondominio());
                        ps.setDouble(16, condominio.getMultaCondominio());
                        ps.setDouble(17, condominio.getRateioCondominio());
                        ps.setString(18, condominio.getDiaVencimento());
                        
                        ps.setInt(19, condominio.getCodCondominio()); 
			ps.executeUpdate();
            
        } catch (SQLException e) {
			         System.out.println("Erro: " + e.getMessage());
		}finally{
			try {
				this.connection.close();
			} catch (Exception e) {
                        }
        }
        
    }
    
    @Override
    public void excluir(Condominio condominio){
        try {
            String sql= "DELETE from condominio where cod_cond=?";
            PreparedStatement smt = this.connection.prepareStatement(sql);
            smt.setInt(1,condominio.getCodCondominio());
            smt.execute();
        } catch (Exception del){
            JOptionPane.showMessageDialog(null,"Erro ao Excluir Condomínio!"+ del);
        }finally{
            try {
                this.connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(JdbcCondominioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public List<Condominio> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Condominio buscarPeloNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Condominio anterior(Integer codigo) {
        
	String sql = "select cod_cond,nome_cond,endereco_cond,bairro_cond,cidade_cond,uf_cond,"
                                + "cep_cond,fone_cond,cnpj_cond,email_cond,sindico_cond,instrucao1,"
                                + "instrucao2,instrucao3,instrucao4,mora_cond,multa_cond,rateio_cond,"
                                + "dia_vencimento_cond from condominio where cod_cond=?";
        
        Condominio condominio = new Condominio();
            try {                      
            
                    PreparedStatement ps = this.connection.prepareStatement(sql);
                    ps.setInt(1, condominio.getCodCondominio());
                    ResultSet rs = ps.executeQuery();
                    rs.previous();
                                                
			condominio.setCodCondominio(rs.getInt("cod_cond"));
			condominio.setNomeCondominio(rs.getString("nome_cond"));
                        condominio.setEnderecoCondominio(rs.getString("endereco_cond"));
                        condominio.setBairroCondominio(rs.getString("bairro_cond"));
                        condominio.setCidadeCondominio(rs.getString("cidade_cond"));
                        condominio.setUfCondominio(rs.getString("uf_cond"));
                        condominio.setCepCondominio(rs.getString("cep_cond"));
                        condominio.setFoneCondominio(rs.getString("fone_cond"));
                        condominio.setCnpjCondominio(rs.getString("cnpj_cond"));
                        condominio.setEmailCondominio(rs.getString("email_cond"));
                        condominio.setSindicoCondominio(rs.getString("sindico_cond"));
                        condominio.setInstrucao1(rs.getString("instrucao1"));
                        condominio.setInstrucao2(rs.getString("instrucao2"));
                        condominio.setInstrucao3(rs.getString("instrucao3"));
                        condominio.setInstrucao4(rs.getString("instrucao4"));
                        condominio.setMoraCondominio(rs.getDouble("mora_cond"));
                        condominio.setMultaCondominio(rs.getDouble("multa_cond"));
                        condominio.setRateioCondominio(rs.getDouble("rateio_cond"));
                        condominio.setDiaVencimento(rs.getString("dia_vencimento_cond"));
                        
			
			
		} catch (SQLException e) {
			                 System.out.println("Erro: " + e.getMessage());
		}finally{
			try{
				this.connection.close();
			}catch(Exception e){}
		}
		return condominio;
        
    }
}
