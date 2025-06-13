import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/testdb"; // Modify with your database details
        String user = "root";  // Change to your DB username
        String password = "password";  // Change to your DB password
        
        // Connection, statement, and result set
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Step 1: Establish the connection
            conn = DriverManager.getConnection(C:\mysql-connector-j-9.1.0.jar);
            System.out.println("Connected to the database!");

            // Step 2: Create a statement
            stmt = conn.createStatement();

            // Step 3: Execute a query (Retrieve data from users table)
            String sql = "SELECT * FROM users";
            rs = stmt.executeQuery(sql);

            // Step 4: Process the result set
            System.out.println("User List:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                
                System.out.println("ID: " + id + ", Name: " + name );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Step 5: Close the resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}



