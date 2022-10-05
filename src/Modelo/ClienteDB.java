/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Christian
 */
public class ClienteDB {
    private String DPI;
    private String nombre;
    private String direccion_envio;
    private int telefono;
    private double saldo;
    private int limite_credito;
    private double descuento;

    public ClienteDB() {
    }

    public ClienteDB(String DPI, String nombre, String direccion_envio, int telefono, double saldo, int limite_credito, double descuento) {
        this.DPI = DPI;
        this.nombre = nombre;
        this.direccion_envio = direccion_envio;
        this.telefono = telefono;
        this.saldo = saldo;
        this.limite_credito = limite_credito;
        this.descuento = descuento;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion_envio() {
        return direccion_envio;
    }

    public void setDireccion_envio(String direccion_envio) {
        this.direccion_envio = direccion_envio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getLimite_credito() {
        return limite_credito;
    }

    public void setLimite_credito(int limite_credito) {
        this.limite_credito = limite_credito;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
