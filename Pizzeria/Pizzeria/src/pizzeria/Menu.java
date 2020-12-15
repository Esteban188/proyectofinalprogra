/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author David
 */
public class Menu {
    private int opcion;
    public static Productos menuProductos = new Productos();
    
    
    public static void llenarMenu(){
        Pizza pizza = new Pizza("Mexicana", 8500, "Grande", "Salsa de tomate, queso, carne y chile jalapeño");
        menuProductos.agregarPizza(pizza);
        
        Pizza pizza2 = new Pizza("Jamón y Queso", 8500, "Mediana", "Salsa de tomate, queso mozarella y jamón");
        menuProductos.agregarPizza(pizza2);
        
        Lasagna lasagna = new Lasagna("Boloñesa", 4500, "Carne");
        menuProductos.agregarLasagna(lasagna);
        
        Lasagna lasagna2 = new Lasagna("Italiana", 6850, "Pollo");
        menuProductos.agregarLasagna(lasagna2);
        
        Bebida bebida = new Bebida("GingerAle", "Gengibre", "Gaseosa", 1200);
        menuProductos.agregarBebida(bebida);
        
        Bebida bebida2 = new Bebida("Fanta Uva", "Uva", "Gaseosa", 950);
        menuProductos.agregarBebida(bebida2);
    }
    public static String[][] llenarMatrizMesas(String mesas[][]){
        mesas[0][0] = "Disponible";
        mesas[0][1] = "Disponible";
        mesas[0][2] = "Disponible";
        
        mesas[1][0] = "Disponible";
        mesas[1][1] = "Disponible";
        mesas[1][2] = "Disponible";
        
        mesas[2][0] = "Disponible";
        mesas[2][1] = "Disponible";
        mesas[2][2] = "Disponible";
        return mesas;
    }
    
    
    public void mostrarMenu() {
       
        //Pone el color del JOption
        UIManager UI=new UIManager();
        UI.put("OptionPane.background",new ColorUIResource(227,238,135));
        UI.put("Panel.background",new ColorUIResource(227,238,135)); 
        
        while (opcion != 3) {
            MenuAdministrador menuAdm = new MenuAdministrador();
            MenuCliente menuCliente = new MenuCliente();
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "\n*     Bienvenido al Menú Principal     *\n\n"
                    + "1.Ir al menú de administración\n"
                    + "2.Ir al menú de clientes\n"
                    + "3.Salir\n\n"
                    +"Elija el número de la acción que desea realizar:"));
            switch (opcion) {
                case 1: {
                    menuAdm.mostrarMenu();
                    break;    
                }
                case 2:{
                    menuCliente.mostrarMenu();
                    break;
                }
                case 3:{
                    JOptionPane.showMessageDialog(null, "¡Gracias por usar el sistema, vuelva pronto! :)");
                    System.exit(0);
                    break;
                }
                default:{
                    JOptionPane.showMessageDialog(null, "Opción no disponible, por favor elija una opción válida");
                }
            }
        }
    }
}
