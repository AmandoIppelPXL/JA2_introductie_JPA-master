package be.pxl.ja2.jpa.init;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableMessage {

    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicdb?useSSL=false", "root", "");
            Statement statement = conn.createStatement()) {
            statement.execute("CREATE TABLE message (id INTEGER NOT NULL AUTO_INCREMENT, text TEXT, PRIMARY KEY (id))");
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
