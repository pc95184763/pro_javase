package com.peng.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo01 {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //0. 添加jar文件
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/0805db";
            String username = "root";
            String password = "Zxc.12345";
            Connection conn = DriverManager.getConnection(url,username,password);

            System.out.println(conn == null? "失败": "成功");

        //1.

    }

}


