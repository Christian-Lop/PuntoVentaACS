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
public class Proveedores {
    Connection con;
    Conexion cnx = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    public boolean RegistroProv(ProveedoresDB pr){
        String mysql = "INSERT INTO proveedor(NIT, nombre, telefono, direccion, fabrica) VALUES (?,?,?,?,?)";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(mysql);
            ps.setInt(1, pr.getNIT());
            ps.setString(2, pr.getNombre());
            ps.setInt(3, pr.getTelefono());
            ps.setString(4, pr.getDireccion());
            ps.setString(5, pr.getFabrica());
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
    
    
    public List listarprov() {
        List<ProveedoresDB> listpr = new ArrayList();
        String mysql = "SELECT * FROM proveedor";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(mysql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                ProveedoresDB proDB = new ProveedoresDB();
                proDB.setNIT(rs.getInt("NIT"));
                proDB.setNombre(rs.getString("nombre"));
                proDB.setTelefono(rs.getInt("telefono"));
                proDB.setDireccion(rs.getString("direccion"));
                proDB.setFabrica(rs.getString("fabrica"));
                listpr.add(proDB);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return listpr;
    }
}
