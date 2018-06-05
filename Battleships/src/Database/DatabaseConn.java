/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import battleships.database;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;


/**
 *
 * @author Vaughn
 */
public class DatabaseConn {
    

    
    Properties props;
    Connection conn;
    ResultSet rs, rs1;
    PreparedStatement pst;  
    
    public DatabaseConn() {
        getConnection();
    }

    public void getConnection() {
    //Using db.properties
    try {
        //Using db.properties 
        props = new Properties();
        try {                
            FileInputStream in =
                new FileInputStream("db.properties");
            props.load(in);
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } 
        String url = props.getProperty("mysql.url");
        String username = props.getProperty("mysql.username");
        String password = props.getProperty("mysql.password");
        conn = DriverManager.getConnection(url, username, password);
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    
    public void loadTable() {
        try {
            getConnection();
            
            String sq1 = "SELECT DISTINCT * FROM highscores";
            rs = runQuery(sq1);
//            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }   
    
    private ResultSet runQuery(String sqlSt) throws SQLException {
        pst = conn.prepareStatement(sqlSt);
        ResultSet rs = pst.executeQuery();
        return rs;
    }    
    
    public void insertScore(String name, int score) {
        try {
            String sql = "INSERT INTO highscores VALUES (?,?,?)";
            GregorianCalendar today = new GregorianCalendar();
            int day = today.get(Calendar.DAY_OF_MONTH);
            int month = today.get(Calendar.MONTH) + 1;
            int year = today.get(Calendar.YEAR);
            String date = "";
            if (day < 10 || month < 10) {
                if (day < 10 && month > 10) {
                    date = "0" + Integer.toString(day) + "-" 
                            + Integer.toString(month) +
                        "-" + Integer.toString(year);
                } else if (day > 10 && month < 10) {
                    date = Integer.toString(day) + "-0" 
                            + Integer.toString(month) +
                        "-" + Integer.toString(year);                    
                } else if (day < 10 && month < 10) {
                    date = "0" + Integer.toString(day) + "-0" 
                            + Integer.toString(month) +
                        "-" + Integer.toString(year);  
                } else {
                    date = Integer.toString(day) + "-" 
                            + Integer.toString(month) +
                            "-" + Integer.toString(year);                    
                }
            }
            pst = conn.prepareStatement(sql);
            
            pst.setString(1, name);
            pst.setString(2, date);
            pst.setInt(3, score);
            
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ResultSet getScores() {
        try {
            getConnection();
            String sql = "SELECT DISTINCT * FROM highscores ORDER BY NumOfTurnsToWin asc";
            return runQuery(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }      
            

}
