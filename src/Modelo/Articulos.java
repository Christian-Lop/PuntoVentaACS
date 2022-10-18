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
public class Articulos {
    Connection con;
    Conexion cnx = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean registroarticulos(ArticulosDB art){
        String mysql = "INSERT INTO articulos (codigo, nombre, proveedor, ingresa, descripcion, precio) VALUE (?,?,?,?,?,?)";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(mysql);
            ps.setString(1, art.getCodigo());
            ps.setString(2, art.getNombre());
            ps.setString(3, art.getProveedor());
            ps.setInt(4, art.getIngresa());
            ps.setString(5, art.getDescripcion());
            ps.setDouble(6, art.getPrecio());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public void listarproveedor(JComboBox provBox){
        String mysql = "SELECT nombre FROM proveedor";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(mysql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                provBox.addItem(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    public List listararticulos() {
        List<ArticulosDB> listart = new ArrayList();
        String mysql = "SELECT * FROM articulos";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(mysql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                ArticulosDB artDB = new ArticulosDB();
                artDB.setCodigo(rs.getString("codigo"));
                artDB.setNombre(rs.getString("nombre"));
                artDB.setProveedor(rs.getString("proveedor"));
                artDB.setIngresa(rs.getInt("ingresa"));
                artDB.setDescripcion(rs.getString("descripcion"));
                artDB.setPrecio(rs.getDouble("precio"));
                listart.add(artDB);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listart;
    }
    
    public boolean deletarticulo(String codigo){
        String mysql = "DELETE FROM articulos WHERE codigo = ?";
        try {
            ps = con.prepareStatement(mysql);
            ps.setString(1, codigo);
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
    
    public boolean actualizararticulo(ArticulosDB artDB){
        String mysql = "UPDATE articulos SET codigo = ?, nombre = ?, proveedor = ?, ingresa = ?, descripcion = ?, precio = ? WHERE codigo = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(mysql);
            ps.setString(1, artDB.getCodigo());
            ps.setString(2, artDB.getNombre());
            ps.setString(3, artDB.getProveedor());
            ps.setInt(4, artDB.getIngresa());
            ps.setString(5, artDB.getDescripcion());
            ps.setDouble(6, artDB.getPrecio());
            ps.setString(7, artDB.getCodigo());
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
    
    public ArticulosDB BusArticulos(String codigo){
        ArticulosDB artDB = new ArticulosDB();
        String mysql = "SELECT * FROM articulos WHERE codigo = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(mysql);
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            if (rs.next()) {
                artDB.setNombre(rs.getString("Nombre"));
                artDB.setIngresa(rs.getInt("Ingresa"));
                artDB.setPrecio(rs.getDouble("Precio"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return artDB;
    }
    
}
