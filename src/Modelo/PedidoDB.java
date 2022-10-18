/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Christian
 */
public class PedidoDB {
    private String NIT_cliente;
    private String nombre_cliente;
    private String usuario;
    private Double total;

    public PedidoDB() {
    }

    public PedidoDB(String NIT_cliente, String nombre_cliente, String usuario, Double total) {
        this.NIT_cliente = NIT_cliente;
        this.nombre_cliente = nombre_cliente;
        this.usuario = usuario;
        this.total = total;
    }

    public String getNIT_cliente() {
        return NIT_cliente;
    }

    public void setNIT_cliente(String NIT_cliente) {
        this.NIT_cliente = NIT_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    
    
    
}
