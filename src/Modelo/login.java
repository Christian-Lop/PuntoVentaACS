/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christian
 */
public class login {
    Connection conect;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cnx = new Conexion();
    
    public loginDB lg(String correo, String password){
        loginDB log = new loginDB();
        String mysql = "SELECT * FROM usuarios WHERE correo = ? AND password = ?";
        try {
            conect = cnx.getConnection();
            ps = conect.prepareStatement(mysql);
            ps.setString(1, correo);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                log.setId(rs.getInt("id"));
                log.setNombre(rs.getString("nombre"));
                log.setCorreo(rs.getString("correo"));
                log.setPassword(rs.getString("password"));
            }            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return log;
    }
    
}
