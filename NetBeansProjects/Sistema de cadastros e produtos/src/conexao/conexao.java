/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author jatta
 */
public class conexao {
    private static final String URL = "jdbc:sqlite:produtos.db";
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL);
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
