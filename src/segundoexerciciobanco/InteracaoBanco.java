/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoexerciciobanco;

import java.sql.*;

/**
 *
 * @author Yan
 */
public class InteracaoBanco {
    public void Listar() throws SQLException{
        Connection conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", "root", "root");
        
        Statement stmt = conexao.createStatement();
        
        ResultSet rs = stmt.executeQuery("SELECT * FROM agenda");
        
        while(rs.next()){
            System.out.println("Nome:" + rs.getString("Nome"));
            System.out.println("Telefone:" + rs.getInt("Telefone"));
            System.out.println("Celular:" + rs.getInt("Celular"));
            System.out.println("Email:" + rs.getString("Email"));
        }
        
        conexao.close();
    }
    public void Inserir() throws SQLException{
        Connection conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", "root", "root");
        
        Statement stmt = conexao.createStatement();
        
        int resultado = stmt.executeUpdate("INSERT INTO agenda"
                + " VALUES (\"Anderson\", 12345, 67890, "
                + "\"asantos@unicari\")");
        
        System.out.println(resultado + " linhas afetadas");
        
        conexao.close();
    }
    public void Remover() throws SQLException{
        Connection conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", "root", "root");
        
        Statement stmt = conexao.createStatement();
        
        int resultado = stmt.executeUpdate("DELETE FROM agenda;");
        
        System.out.println(resultado + " linhas afetadas");
        
        conexao.close();
    }
    public void Atualizar() throws SQLException{
        Connection conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", "root", "root");
        
        Statement stmt = conexao.createStatement();
        
        int resultado = stmt.executeUpdate("UPDATE agenda SET celular=99999"
                + " WHERE Nome LIKE '%Anderson%';");
        
        System.out.println(resultado + " linhas afetadas");
        
        conexao.close();
    }
}
