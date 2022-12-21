package chapter11;

import java.sql.*;
import java.util.Date;

public class filec11e1 {
    public static void main(String[] args) throws Exception{
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;
        try{
            Class.forName("com,mysql.cj.jdbc.Driver");
            String url = "";
            String username = "root";
            String password = "";
            conn = DriverManager.getConnection(url,username,password);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM users";
            rs = stmt.executeQuery(sql);
            System.out.println("id | name | passwd | ");
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String psw = rs.getString("password");
                String email = rs.getString("email");
                Date birth = rs.getDate("birthday");
                System.out.println(id + name+ psw+ email+ birth);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
