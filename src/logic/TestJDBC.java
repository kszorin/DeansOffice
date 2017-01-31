package logic;

import java.sql.*;

/**
 * Created by zorin on 31.01.2017.
 */
public class TestJDBC {
    public static void main (String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet result = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/students";
            connection = DriverManager.getConnection(url, "kszorin", "mysql");
            statement = connection.createStatement();
            result = statement.executeQuery("SELECT * FROM students");

        }catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (result != null)
                    result.close();
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException sqlEx){
                sqlEx.printStackTrace();
                System.err.println("Error: " + sqlEx.getMessage());
            }
        }

    }
}
