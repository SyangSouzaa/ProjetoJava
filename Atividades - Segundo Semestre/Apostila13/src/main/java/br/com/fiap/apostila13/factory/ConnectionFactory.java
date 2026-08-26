package br.com.fiap.apostila13.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    //static -> metodo pertence a classe e não ao objeto, ou seja, não precisa de uma instancia
    public static Connection  getConnection() throws ClassNotFoundException, SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "RM569259", "180105");
        return  conexao;
    }


}
