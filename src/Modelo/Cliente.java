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
public class Cliente {
    Connection con;
    Conexion cnx = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean registroclientes (ClienteDB cls){
        String mysql = "INSERT INTO clientes (DPI, nombre, direccion_envio, telefono, saldo, limite_credito, descuento) VALUE (?,?,?,?,?,?,?)";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(mysql);
            ps.setString(1, cls.getDPI());
            ps.setString(2, cls.getNombre());
            ps.setString(3, cls.getDireccion_envio());
            ps.setInt(4, cls.getTelefono());
            ps.setDouble(5, cls.getSaldo());
            ps.setInt(6, cls.getLimite_credito());
            ps.setDouble(7, cls.getDescuento());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public List listarClientes() {
        List<ClienteDB> listclsDB = new ArrayList();
        String mysql = "SELECT * FROM clientes";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(mysql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                ClienteDB clsDB = new ClienteDB();
                clsDB.setDPI(rs.getString("DPI"));
                clsDB.setNombre(rs.getString("nombre"));
                clsDB.setDireccion_envio(rs.getString("direccion_envio"));
                clsDB.setTelefono(rs.getInt("telefono"));
                clsDB.setSaldo(rs.getDouble("saldo"));
                clsDB.setLimite_credito(rs.getInt("limite_credito"));
                clsDB.setDescuento(rs.getDouble("descuento"));
                listclsDB.add(clsDB);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listclsDB;
    }
    
    
    public boolean deletcliente(String DPI){
        String mysql = "DELETE FROM clientes WHERE DPI = ?";
        try {
            ps = con.prepareStatement(mysql);
            ps.setString(1, DPI);
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
       
    public boolean actualircliente(ClienteDB clsDB){
        String mysql = "UPDATE clientes SET DPI = ?, nombre = ?, direccion_envio = ?, telefono = ?, saldo = ?, limite_credito = ?, descuento = ? WHERE DPI = ?";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(mysql);
            ps.setString(1, clsDB.getDPI());
            ps.setString(2, clsDB.getNombre());
            ps.setString(3, clsDB.getDireccion_envio());
            ps.setInt(4, clsDB.getTelefono());
            ps.setDouble(5, clsDB.getSaldo());
            ps.setInt(6, clsDB.getLimite_credito());
            ps.setDouble(7, clsDB.getDescuento());
            ps.setString(8, clsDB.getDPI());
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

