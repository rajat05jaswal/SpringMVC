/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.homework4.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Arrays;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

/**
 *
 * @author Rajat
 */
public class Dao {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/webtools";
    static final String USER = "root";
    static final String PASSWORD = "Rajat@1994";
    private Connection connection;
    
    public Connection getConnection() throws Exception {
        try {
            Connection connection = null;
            DbUtils.loadDriver(JDBC_DRIVER);
            this.connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (SQLException ex) {
            System.out.println("SQL Exception :"+ex);
            ex.printStackTrace();
            throw new Exception();
        } finally{
//            endConnection();
        }
        return this.connection;
    }
    
//    public void endConnection() throws Exception{
//        try{
//            connection.close();
//        }catch(SQLException e){
//            System.out.println(e);
//        }
//    }

   
}
