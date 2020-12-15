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
public class Productos { //La clase debería llamarse menú porque representa el menú de un restaurante, pero para evitar confusiones con el menú de opciones de la app, se le llamó Productos
    //Por el momento, máximo de objetos en cada lista es 25
    Pizza pizzas[] = new Pizza[10];
    Lasagna lasagnas[] = new Lasagna[10];
    Bebida bebidas[] = new Bebida[10];

    //Constructor
    public Productos() {
    }
    
    //Gets
    public Pizza[] getPizzas() {
        return pizzas;
    }

    public Lasagna[] getLasagnas() {
        return lasagnas;
    }

    public Bebida[] getBebidas() {
        return bebidas;
    }

    //Sets
    public void setPizzas(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }

    public void setLasagnas(Lasagna[] lasagnas) {
        this.lasagnas = lasagnas;
    }

    public void setBebidas(Bebida[] bebidas) {
        this.bebidas = bebidas;
    }
    
    public String agregarPizza(Pizza pizza){
        
        //Busca un indice vacío para agregar la nueva pizza
        int indice=-1; 
        for (int i=0; i<=this.pizzas.length-1; i++){
            if (pizzas[i]==null){ //Este revisa si está vacío
                indice = i;
                break;
            }
        }
        
        //Si indice es igual o mayor a cero quiere decir que encontró un indice vacío para agregar una nueva pizza
        if (indice>=0){
            pizza.setID(indice);
            this.pizzas[indice] = pizza;
            return "¡Pizza agregada con éxito!";
        }
        //Si el índice es menor a cero entonces no se encontró un indice y quiere decir que el vector está lleno
        else{
            return "Lo sentimos, ya ha registrado la cantidad máxima de pizzas.";
        }
        
        
    }
    
     public String agregarLasagna(Lasagna lasagna){
        
        //Busca un indice vacío para agregar la nueva lasagna
        int indice=-1; 
        for (int i=0; i<=this.lasagnas.length-1; i++){
            if (lasagnas[i]==null){
                indice = i;
                break;
            }
        }
        
        //Si indice es igual o mayor a cero quiere decir que encontró un indice vacío para agregar una nueva lasagna
        if (indice>=0){
            lasagna.setID(indice);
            this.lasagnas[indice] = lasagna;
            return "¡Lasagna agregada con éxito!";
        }
        //Si el índice es menor a cero entonces no se encontró un indice y quiere decir que el vector está lleno
        else{
            return "Lo sentimos, ya ha registrado la cantidad máxima de lasagnas.";
        }
    }
     
     public String agregarBebida(Bebida bebida){
        
        //Busca un indice vacío para agregar la nueva lasagna
        int indice=-1; 
        for (int i=0; i<=this.bebidas.length-1; i++){
            if (bebidas[i]==null){
                indice = i;
                break;
            }
        }
        
        //Si indice es igual o mayor a cero quiere decir que encontró un indice vacío para agregar una nueva lasagna
        if (indice>=0){
            bebida.setID(indice);
            this.bebidas[indice] = bebida;
            return "¡Bebida agregada con éxito!";
        }
        //Si el índice es menor a cero entonces no se encontró un indice y quiere decir que el vector está lleno
        else{
            return "Lo sentimos, ya ha registrado la cantidad máxima de bebidas.";
        } 
    }
    
}
