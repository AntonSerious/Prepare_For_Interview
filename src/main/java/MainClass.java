import java.sql.*;

public class MainClass {
    static String url = "jdbc:mysql://localhost:3307/iMarket";
    static String user = "root";
    static String password = "admin";
    static Statement stmt;
    static ResultSet rs;
    static Connection conn;
    public static void main(String[] args) throws SQLException {

        try {
            conn = DriverManager.getConnection(url, user, password);

            String query = "select * from products";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println(rsmd.getColumnCount());
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.print(rsmd.getColumnName(i) + " ");

            }

            while (rs.next()) {
                for (int i = 1; i < rsmd.getColumnCount(); i++) {
                    System.out.print(rs.getString(i) + " ");
                }
                System.out.println();
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        finally{
            conn.close();
            stmt.close();
            rs.close();
        }
    }
}
