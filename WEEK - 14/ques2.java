package week_14;

import java.sql.*;
public class ques2 {
    public static void main(String [] args){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Root");
            System.out.println("Connection successful");
            Statement st = con.createStatement();
            String query = "update student set name = 'Rafiya' where id =243";
            st.executeUpdate(query);
            System.out.println("Update success");
            
            st.close();
            con.close();
        }
        catch(SQLException e){
            System.out.println("Connection error.");
        }
    }
}
