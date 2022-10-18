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
        return result;
    }
}
