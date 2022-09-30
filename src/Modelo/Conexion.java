/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Christian
 */
public class Conexion {
    Connection conexion;
    public Connection getConnection(){
        try {
            String DB = "jdbc:mysql://localhost:3306/puntoventa?serverTimezone=UTC";
            conexion = DriverManager.getConnection(DB, "root", "chris");
            return conexion;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
}
