package com.peng.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo03 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        PreparedStatement psmt = null ;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///0805db","root","Zxc.12345");

            String sql = "update t_person set pname=? , address=? where pid=?";
            
            psmt = conn.prepareStatement(sql);

            psmt.setString(1,"大王哈哈哈");
            psmt.setString(2, "尚硅谷");
            psmt.setInt(3,4);
            int count = psmt.executeUpdate();
            System.out.println( count > 0 ? "成功":"failed" );
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                psmt.close();
                conn.close();
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }





    }


}

