/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoexerciciobanco;

import java.sql.SQLException;

/**
 *
 * @author Yan
 */
public class SegundoExercicioBanco {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args)
            throws SQLException {
        InteracaoBanco ib = new InteracaoBanco();
        System.out.println("SELECT");
        ib.Listar();
        System.out.println("INSERT");
        ib.Inserir();
        System.out.println("SELECT");
        ib.Listar();
        System.out.println("UPDATE");
        ib.Atualizar();
        System.out.println("SELECT");
        ib.Listar();
        System.out.println("DELETE");
        ib.Remover();
        System.out.println("SELECT");
        ib.Listar();        
    }
    
}
