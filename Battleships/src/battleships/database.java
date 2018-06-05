/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleships;

import Database.DatabaseConn;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Vaughn
 */
public class database {

    DatabaseConn db = new DatabaseConn();
    
    public ResultSet getScoreTable() {
        return db.getScores();
    }    
    
    public void insertNewScore(String name, int score) {
        db.insertScore(name, score);
    }
}
