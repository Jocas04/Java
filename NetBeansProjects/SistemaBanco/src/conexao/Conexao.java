package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static final String URL =
            "jdbc:sqlite:banco.db";

    public static Connection conectar() {

        try {

            return DriverManager.getConnection(URL);

        } catch (Exception e) {

            e.printStackTrace();
            return null;
        }
    }
}