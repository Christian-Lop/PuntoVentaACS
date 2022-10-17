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
import javax.swing.JComboBox;

/**
 *
 * @author Christian
 */
public class Fabricas {

    Connection con;
    Conexion cnx = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrofabricas(FabricasDB fabDB) {
        String mysql = "INSERT INTO fabrica (codigo, nombre, telefono, direccion) VALUE (?,?,?,?)";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(mysql);
            ps.setString(1, fabDB.getCodigo());
            ps.setString(2, fabDB.getNombre());
            ps.setInt(3, fabDB.getTelefono());
            ps.setString(4, fabDB.getDireccion());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public List listarFabricas() {
        List<FabricasDB> listFab = new ArrayList();
        String mysql = "SELECT * FROM fabrica";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(mysql);
            rs = ps.executeQuery();
            while (rs.next()) {
                FabricasDB fabDB = new FabricasDB();
                fabDB.setCodigo(rs.getString("codigo"));
                fabDB.setNombre(rs.getString("nombre"));
                fabDB.setTelefono(rs.getInt("telefono"));
                fabDB.setDireccion(rs.getString("direccion"));
                listFab.add(fabDB);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listFab;
    }
    
    public boolean deletfabricas(String cod){
        String mysql = "DELETE FROM fabrica WHERE codigo = ?";
        try {
            ps = con.prepareStatement(mysql);
            ps.setString(1, cod);
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
    
    public boolean actualizfabrica(FabricasDB fabDB){
        String mysql = "UPDATE fabrica SET codigo = ?, nombre = ?, telefono = ?, direccion = ? WHERE codigo = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(mysql);
            ps.setString(1, fabDB.getCodigo());
            ps.setString(2, fabDB.getNombre());
            ps.setInt(3, fabDB.getTelefono());
            ps.setString(4, fabDB.getDireccion());
            ps.setString(5, fabDB.getCodigo());
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
