/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author krista
 */
public class Bebida {
    //Atributos
    int ID;
    String nombre, sabor, tipo; //Tipo: Natural, Gaseosa o Agua
    double precio;

    //Constructor
    public Bebida(String nombre, String sabor, String tipo, double precio) {
        this.ID = 0;
        this.nombre = nombre;
        this.sabor = sabor;
        this.tipo = tipo;
        this.precio = precio;
    }

    //Sets
    public void setID(int ID){
        this.ID = ID;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Gets
    public int getID(){
        return ID;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getSabor() {
        return sabor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }
    
    //Devuelve toda la información de la bebida
    public String getBebida(){
        return "ID: "+this.ID+"\nNombre: "+this.nombre+"\nSabor: "+this.sabor+"\nTipo: "+this.tipo+"\nPrecio: "+this.precio;
    }
}
