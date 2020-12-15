/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author David
 */
public class Cliente {
    String nombre, direccion;
    int telefono, cedula;

    public Cliente(String nombre, String direccion, int telefono, int cedula) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cedula = cedula;
    }

    //Gets
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getCedula() {
        return cedula;
    }

    //Sets
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    //Devuelve toda la información del cliente
    public String getCliente(){
        return "Nombre: "+this.nombre+"\nCédula: "+this.cedula+"\nTelefono: "+this.telefono+"\nDirección: "+this.direccion;
    }
    
}
