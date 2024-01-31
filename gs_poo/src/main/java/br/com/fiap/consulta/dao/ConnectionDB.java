package br.com.fiap.consulta.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {

    // Variáveis para os detalhes da conexão
    private static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static final String USER = "RM94330";
    private static final String PASS = "fiap";

    // Método para obter uma conexão com o banco de dados
    public static Connection getConnection() {
        try {
            // Carrega o driver JDBC do Oracle
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Retorna uma conexão
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            // Imprime o erro e lança uma exceção não verificada
            throw new RuntimeException("Erro ao conectar ao banco de dados", e);
        }
    }
}
