/* Java Database Connection for SQL */
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {

    public static void main(String[] args) {

        try {
            /* Making a connection to sql DB */
            String userName = "root";
            String pass = "password";
            String url = "jdbc:mysql://localhost:3306/universitymanagement";

            Connection connection = DriverManager.getConnection(url, userName, pass);

            /* Checks to see if app is connected to sql DB */
            if (connection != null) {
                System.out.println("Connected");
            } else
                System.out.println("Not Connected");
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
