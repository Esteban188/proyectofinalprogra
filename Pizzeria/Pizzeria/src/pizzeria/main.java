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
public class main {
    public static int numeros;
    public static Menu menu = new Menu();
    public static String mesas[][] = new String[3][3];
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mesas = Menu.llenarMatrizMesas(mesas); //Para establecer el estado de las mesas a Disponible
        Menu.llenarMenu(); //Para que ya hayan productos registrados
        menu.mostrarMenu();
    }
    
}
