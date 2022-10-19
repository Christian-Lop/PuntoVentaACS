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
public class Pedido {
    Connection con;
    Conexion cnx = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int result;
    public int registropedido(PedidoDB peDB){
        String mysql = "INSERT INTO pedidos (NIT_cliente, nombre_cliente, usuario, total) VALUES (?,?,?,?)";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(mysql);
            ps.setString(1, peDB.getNIT_cliente());
            ps.setString(2, peDB.getNombre_cliente());
            ps.setString(3, peDB.getUsuario());
            ps.setDouble(4, peDB.getTotal());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return result;
    }
    
    public int registrodetallepedido (DetallesPedidoDB DetDB){
        String mysql = "INSERT INTO detallespedidos (codigo_articulo, nombre_articulo, cantidad, precio, id_pedido) VALUES (?,?,?,?,?)";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(mysql);
            ps.setString(1, DetDB.getCodigo_articulo());
            ps.setString(2, DetDB.getNombre_articulo());
            ps.setInt(3, DetDB.getCantidad());
            ps.setDouble(4, DetDB.getPrecio());
            ps.setInt(5, DetDB.getId_pedido());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return result;
    }
    
    public int IDpedido(){
        int id = 0;
        String mysql = "SELECT MAX(id) FROM pedidos";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(mysql);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return id;
    }
    
    public boolean UpdateStock(int cantidad, String codigo){
        String mysql = "UPDATE articulos SET ingresa = ? WHERE codigo = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(mysql);
            ps.setInt(1, cantidad);
            ps.setString(2, codigo);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public List listarpedidos() {
        List<PedidoDB> listped = new ArrayList();
        String mysql = "SELECT * FROM pedidos";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(mysql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                PedidoDB pedDB = new PedidoDB();
                pedDB.setNIT_cliente(rs.getString("NIT_cliente"));
                pedDB.setNombre_cliente(rs.getString("Nombre_cliente"));
                pedDB.setUsuario(rs.getString("Usuario"));
                pedDB.setTotal(rs.getDouble("Total"));
                listped.add(pedDB);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listped;
    }
}
