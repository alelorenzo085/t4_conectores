package com.edu;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Chorrada {
    public static void ejecutar() {
        ConnectionPool cp = ConnectionPool.getInstance();

        try(Connection conn = cp.getConnection()) {
            String sqlString = "SELECT count(*) FROM Estudiante";
            try(
                Statement stmt = conn.createStatement(); 
            ResultSet rs = stmt.executeQuery(sqlString);
                
             ) {
                if(rs.next()) {
                    int count = rs.getInt(1);
                    System.out.printf("Número de estudiantes: %d \f", count);
                }
            }
        }

        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
