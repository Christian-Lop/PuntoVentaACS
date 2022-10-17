/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Christian
 */
public class ProveedoresDB {
    private int NIT;
    private String nombre;
    private int telefono;
    private String direccion;
    private String fabrica;

    public ProveedoresDB() {
    }

    public ProveedoresDB(int NIT, String nombre, int telefono, String direccion, String fabrica) {
        this.NIT = NIT;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fabrica = fabrica;
    }

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFabrica() {
        return fabrica;
    }

    public void setFabrica(String fabrica) {
        this.fabrica = fabrica;
    }

    
    
}
