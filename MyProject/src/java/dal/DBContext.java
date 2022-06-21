/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tai
 */

    public abstract class DBContext<T> {
    protected Connection connection;
    public DBContext(){
        try {
            String user = "dmtai";
            String pass = "0963318329";
            String url = "jdbc:sqlserver://DESKTOP-7CD223F\\SQLEXPRESS:1433;databaseName=Assignment";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try {
                connection=DriverManager.getConnection(url, user, pass);
            } catch (SQLException ex) {
                Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public abstract ArrayList<T> list();
    public abstract T get(T entity);
    public abstract void insert(T entity);
    public abstract void update(T entity);
    public abstract void delete(T entity);
}

