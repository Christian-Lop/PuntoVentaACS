/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Christian
 */
public class Usuarios {
    Connection con;
    Conexion cnx = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean registroUsuarios(UsuariosDB usuDB){
        String mysql = "INSERT INTO usuarios (nombre, correo, password) VALUE (?,?,?)";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(mysql);
            ps.setString(1, usuDB.getNombre());
            ps.setString(2, usuDB.getCorreo());
            ps.setString(3, usuDB.getPassword());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    
    public List listarUsuarios() {
        List<UsuariosDB> listUsu = new ArrayList();
        String mysql = "SELECT * FROM usuarios";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(mysql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                UsuariosDB usuDB = new UsuariosDB();
                usuDB.setNombre(rs.getString("nombre"));
                usuDB.setCorreo(rs.getString("correo"));
                usuDB.setPassword(rs.getString("password"));
                listUsu.add(usuDB);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listUsu;
    }
    
    public boolean deletUsuario(String correo){
        String mysql = "DELETE FROM usuarios WHERE correo = ?";
        try {
            ps = con.prepareStatement(mysql);
            ps.setString(1, correo);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
    public boolean actualizarUsuarios(UsuariosDB usuDB){
        String mysql = "UPDATE usuarios SET nombre = ?, correo = ?, password = ? WHERE correo = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(mysql);
            ps.setString(1, usuDB.getCorreo());
            ps.setString(2, usuDB.getNombre());
            ps.setString(3, usuDB.getPassword());
            ps.setString(4, usuDB.getCorreo());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
}
