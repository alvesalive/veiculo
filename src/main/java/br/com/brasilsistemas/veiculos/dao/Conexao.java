/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brasilsistemas.veiculos.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alvesalive
 */
public class Conexao {
    
    public Connection conectar() throws ClassNotFoundException {
        
        Connection conexao = null;
        
        try {
            
            String driver = "org.postgresql.Driver";
            Class.forName(driver);
            String url = "jdbc:postgresql://localhost:5432/sophie";
            String usuario = "postgres";   
            String senha = "";

            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conectou com sucesso.");
            
        } catch (SQLException e) {
            
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
            
        
        
        
        
        return conexao;
    }
    
    
}
