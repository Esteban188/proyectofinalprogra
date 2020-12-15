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
public class Lasagna {
    int ID;
    String nombre, tipo; //Tipo: Carne o pollo
    double precio;

    //Constructor
    public Lasagna(String nombre, double precio, String tipo) {
        this.ID = 0;
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    //Sets
    public void setID(int ID){
        this.ID = ID;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIngredientes(String tipo) {
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

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }
    
    //Devuelve los datos de la lasagna
    public String getLasagna(){
        return "ID: "+this.ID+"\nNombre: "+this.nombre+"\nTipo: "+this.tipo+"\nPrecio: "+this.precio; //Devuelve todos los datos de la lasagna
    }
}


