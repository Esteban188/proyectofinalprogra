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
public class Pizza {
    //Atributos
    int ID;
    String nombre;
    double precio;
    String tamanno;
    String ingredientes;

    //Constructor
    public Pizza(String nombre, double precio, String tamanno, String ingredientes) {
        this.ID = 0;
        this.nombre = nombre;
        this.precio = precio;
        this.tamanno = tamanno;
        this.ingredientes = ingredientes;
    }
    
    //Sets
    public void setID(int ID){
        this.ID = ID; 
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTamanno(String tamanno) {
        this.tamanno = tamanno;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    //Gets
    public int getID() {
        return ID;
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTamanno() {
        return tamanno;
    }

    public String getIngredientes() {
        return ingredientes;
    }
    
    public String getPizza(){
        
        return "ID: "+this.ID+"\nNombre: "+this.nombre+"\nTamaño: "+this.tamanno+"\nIngredientes: "+this.ingredientes+"\nPrecio: "+this.precio; //Devuelve toda la información de la pizza
    }
}
