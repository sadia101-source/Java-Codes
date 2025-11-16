package week_14;

import java.sql.*;
public class ques4 {
    public static void main(String [] args){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Root");
            System.out.println("Connection success!");
            Statement st = con.createStatement();
            String sql = "insert into student values (324,'Zainab','Physics');";
            st.executeUpdate(sql);
            System.out.println("New entry inserted.");
        }
        catch(SQLException e){
            System.out.println("Connection error.");
        }
    }
}
