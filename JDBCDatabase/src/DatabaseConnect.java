import java.sql.*;

public class DatabaseConnect {
    public static void main(String[] args) {
        Connection connect = null;
        String url = "jdbc:mysql://localhost/employees?user=root&password=mysql";
        Statement st = null;
        String sql = "SELECT * FROM `employee`";
        try {
            connect = DriverManager.getConnection(url);
            st = connect.createStatement();
            ResultSet data = st.executeQuery(sql);
            while (data.next()){
                System.out.println("ID : " + data.getInt("employee_id"));
                System.out.println("NAME : " + data.getString("employee_name"));
                System.out.println("POSITION : " + data.getString("position"));
                System.out.println("SALARY : " + data.getInt("salary"));
                System.out.println("###########");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}