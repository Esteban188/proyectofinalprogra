/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import javax.swing.JOptionPane;

/**
 *
 * @author krista
 */
public class Pedido {
    Cliente cliente;
    Pizza pizzas[] = new Pizza[10];
    Lasagna lasagnas[] = new Lasagna[10];
    Bebida bebidas[] = new Bebida[10];
    int numeroMesa;


    //Gets
    public Cliente getCliente() {
        return cliente;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public Lasagna[] getLasagnas() {
        return lasagnas;
    }

    public Bebida[] getBebidas() {
        return bebidas;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    //Sets
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setPizzas(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }

    public void setLasagnas(Lasagna[] lasagnas) {
        this.lasagnas = lasagnas;
    }

    public void setBebidas(Bebida[] bebida) {
        this.bebidas = bebida;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
    
    public String agregarPizza(Pizza pizza){
        int cantidadPizzas = this.pizzas.length;
        int indice=-1;
        
        //Busca un espacio vacío en el vector
        for (int i=0; i<=cantidadPizzas-1; i++){
            if(this.pizzas[i]==null){
                indice = i;
                break;
            }
           
        }
        if(indice>=0){
            System.out.println(indice);
            this.pizzas[indice] = pizza;
            return "Pizza agregada al pedido."; 
        }
        else{
            return "Lo lamentamos pero ya superó la cantidad máxima de pizzas por pedido."; 
        }
    }
    
    public String agregarLasagna(Lasagna lasagna){
        int cantidadLasagnas = this.lasagnas.length;
        int indice=-1;
        
        //Busca un espacio vacío en el vector
        for (int i=0; i<=cantidadLasagnas-1; i++){
            if(this.lasagnas[i]==null){
                indice = i;
                break;
            }
        }
        if(indice>=0){
            this.lasagnas[indice] = lasagna;
            return "Lasagna agregada al pedido."; 
        }
        else{
            return "Lo lamentamos pero ya superó la cantidad máxima de lasagnas por pedido."; 
        }
    }
    
    public String agregarBebida(Bebida bebida){
        int cantidadBebidas = this.bebidas.length;
        int indice=-1;
        
        //Busca un espacio vacío en el vector
        for (int i=0; i<=cantidadBebidas-1; i++){
            if(this.bebidas[i]==null){
                indice = i;
                break;
            }
        }
        if(indice>=0){
            this.bebidas[indice] = bebida;
            return "Bebida agregada al pedido."; 
        }
        else{
            return "Lo lamentamos pero ya superó la cantidad máxima de bebidas por pedido."; 
        }
    }
    
    public String getPedidoCompleto(){
          //Creamos los strings
          String informacionPizzas = "*** Pizzas pedidas ***\n";
          String informacionLasagnas = "\n*** Lasagnas pedidas ***\n";
          String informacionBebidas = "\n*** Bebidas pedidas ***\n";
          
          //Se forma un string con todos los datos
           int cantPizzas = pizzas.length;
           if (cantPizzas > 0){
                for(int i=0; i<=cantPizzas-1; i++){
                  Pizza pizzaActual = pizzas[i];
                  if (pizzaActual!=null){
                      informacionPizzas = informacionPizzas + pizzaActual.getPizza()+"\n";
                  }
                  
                }
            }
           
           int cantLasagnas = lasagnas.length;
           if (cantLasagnas > 0){
               for(int i=0; i<=cantLasagnas-1; i++){
                   Lasagna lasagnaActual = lasagnas[i];
                   if (lasagnaActual!=null){
                       informacionLasagnas = informacionLasagnas + lasagnaActual.getLasagna()+"\n";
                   }
                   
               }
           }
           
           int cantBebidas = bebidas.length;
           if (cantBebidas > 0){
               for (int i=0; i<=cantLasagnas-1; i++){
                   Bebida bebidaActual = bebidas[i];
                   if (bebidaActual!=null){
                       informacionBebidas = informacionBebidas + bebidaActual.getBebida();
                   }
                   
                   
               }
           }
           
           //Concatenamos toda la informacion en un solo string
           String productos = "\n\nPedido: \n"+informacionPizzas + informacionLasagnas + informacionBebidas;
           String informacionCliente = "Datos del cliente: \n"+cliente.getCliente(); 
           String numMesa = "\n\nNúmero de mesa: "+numeroMesa;
           
           String completo = informacionCliente + productos;
           return completo;
    }
}
