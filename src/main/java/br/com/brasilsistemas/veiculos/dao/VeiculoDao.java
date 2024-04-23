/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brasilsistemas.veiculos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alvesalive
 */
public class VeiculoDao {
    
    Connection conexao;
    
    
    
    public ResultSet consultaVeiculosPorNome(String nome) throws ClassNotFoundException {
        conexao = new Conexao().conectar();
            
        String sql = "select * from tbl_veiculos where nome = ? ";
  
        ResultSet rs = null;
        try {
            PreparedStatement pstm = conexao.prepareStatement(sql);
             pstm.setString(1, nome);
            rs = pstm.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
       
        
    }
    
    public ResultSet consultaTodosVeiculos() throws ClassNotFoundException {
        conexao = new Conexao().conectar();
            
        String sql = "select * from tbl_veiculos";
  
        ResultSet rs = null;
        try {
            PreparedStatement pstm = conexao.prepareStatement(sql);
     
            rs = pstm.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
        
        
    }
    
    
    
}
