import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcexample {
    public static void main(String[] args){
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306//javatraining";
        Connection con;
        // to make connection
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Database connection establish");
            
        } catch (SQLException e) {
            throw new RuntimeException("Database not connected e");


        }


    }
}

