package week_14;

import java.sql.*;
public class ques3 {
    public static void main(String[] args){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Root");
            System.out.println("Connection success!");
            Statement stm = con.createStatement();
            String q = "delete from student where id = 324";
            stm.executeUpdate(q);
            System.out.println("Deletion executed.");
            
            stm.close();
            con.close();
        }
        catch(SQLException e){
            System.out.println("Connection error.");
        }
    }
}
