package com.peng.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo02 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql:///0805db","root","Zxc.12345");

        String sql = "INSERT INTO t_person values(0,?,?)";

        PreparedStatement psmt = conn.prepareStatement(sql);

        psmt.setString(1,"丁春秋");
        psmt.setString(2,"星宿海");

        int count = psmt.executeUpdate();

        System.out.println( count > 0? "添加成功": "添加失败");

    }

}

