/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author jatta
 */
public class Conexao {
    private static final String URL ="jdbc:sqlite:estoque.db";
    public static Connection conectar() {
        try{
            return DriverManager.getConnection(URL);
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
