package week_14;

import java.sql.*;
public class ques1 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Root");
            System.out.println("Connection Success!");
            Statement s = con.createStatement();
            String sqlQuery = "select * from student;";
            s.executeQuery(sqlQuery);
            System.out.println("Query executed successfully!");
            
            ResultSet rs = null;
            rs = s.executeQuery(sqlQuery);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String major = rs.getString("major");
                System.out.println("ID: " + id + ", Name: " + name + ", Major: " + major);
            }
            System.out.println("Output success.");
            s.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Connection failure.");
        }
    }
}
