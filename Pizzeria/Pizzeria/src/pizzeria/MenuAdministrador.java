/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author krista
 */
public class MenuAdministrador {
    
    //Método para ingresar nuevos productos al menú
    public void IngresarProducto(){
        int opcion=1;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tipo de producto que desea registrar:\n\n"
                    + "1.Pizza\n"
                    + "2.Lasagna\n"
                    + "3.Bebida\n"
                    + "4.Volver al menú principal\n\n"));
        
        switch(opcion){
            case 1:{
                //Pide los datos
                String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la nueva pizza: ");
                String ingredientes = JOptionPane.showInputDialog(null, "Indique los ingredientes de la nueva pizza:");
                String tamanno = JOptionPane.showInputDialog(null, "Indique el tamaño de la nueva pizza: \n\tGrande\n\tMediana\n\tPequeña");
                double precio = Double.parseDouble(JOptionPane.showInputDialog("Indique el precio de la nueva pizza: "));

                //Crea la pizza con el constructor
                Pizza pizza = new Pizza(nombre, precio, tamanno, ingredientes);

                //Agrega la pizza al menu de productos
                String mensaje = Menu.menuProductos.agregarPizza(pizza);
                JOptionPane.showMessageDialog(null, mensaje); //Le dice al usuario si la pizza pudo agregarse o no
                break;      
            }
            case 2:{
                //Pide los datos
                String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la nueva lasagna: ");
                String tipo = JOptionPane.showInputDialog(null,"Indique el tipo de la nueva lasagna: \n\t\tPollo\n\\ttCarne");
                double precio = Double.parseDouble(JOptionPane.showInputDialog(null,"Indique el precio de la nueva lasagna: "));

                //Crea la lasagna con el constructor
                Lasagna lasagna = new Lasagna(nombre, precio, tipo);
                
                
                //Agrega la lasagna al menu de productos
                String mensaje = Menu.menuProductos.agregarLasagna(lasagna);
                JOptionPane.showMessageDialog(null, mensaje); //Le dice al usuario si la bebida pudo agregarse o no
                break;
            }
            case 3:{
                String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la nueva bebida: ");
                String tipo = JOptionPane.showInputDialog(null, "Indique el tipo de la nueva bebida: \n\t\tGaseosa\n\tNatural\n\tAgua");
                String sabor = JOptionPane.showInputDialog(null, "Indique el sabor de la nueva bebida: ");
                double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Indique el precio de la nueva bebida: "));

                //Crea la bebida con el constructor
                Bebida bebida = new Bebida(nombre, sabor, tipo, precio);

                //Agrega la bebida al menu de productos
                String mensaje = Menu.menuProductos.agregarBebida(bebida);
                JOptionPane.showMessageDialog(null, mensaje);
                break;
            }
            case 4:{
                main.menu.mostrarMenu();
                break;
            }
        }     
    }
    
    public void mostrarProductos(){
        
        //Saca los datos de las pizzas
        Pizza pizzas[] = new Pizza[10];
        pizzas = Menu.menuProductos.getPizzas();
        int cantidadPizzas = pizzas.length;
        
        String mensajePizzas = "\n\n*****PIZZAS*****";
        for (int i=0; i<=cantidadPizzas-1; i++){
            if(pizzas[i]!=null){ //Verifica que haya una pizza en el indice
                mensajePizzas = mensajePizzas+"\n"+pizzas[i].getPizza()+"\n";
            }   
        }
        
        //Saca los datos de las lasagnas
        Lasagna lasagnas[] = new Lasagna[10];
        lasagnas = Menu.menuProductos.getLasagnas();
        int cantidadLasagnas = lasagnas.length;
        
        String mensajeLasagnas = "\n\n*****LASAGNAS*****";
        for (int i=0; i<=cantidadLasagnas-1; i++){
            if (lasagnas[i]!=null){
                mensajeLasagnas = mensajeLasagnas+"\n"+lasagnas[i].getLasagna()+"\n";
            }
        }
        
        //Saca los datos de las bebidas
        Bebida bebidas[] = new Bebida[10];
        bebidas = Menu.menuProductos.getBebidas();
        int cantidadBebidas = bebidas.length;
        
        String mensajeBebidas = "\n\n*****BEBIDAS*****";
        for(int i=0; i<=cantidadBebidas-1; i++){
            if(bebidas[i]!=null){
                mensajeBebidas = mensajeBebidas+"\n"+bebidas[i].getBebida()+"\n";
            }
        }
        
        //Construyo el mensaje completo
        String mensaje = mensajePizzas+mensajeLasagnas+mensajeBebidas;
        
        //Muestra todos los productos
        JTextArea textArea = new JTextArea(mensaje);
        JScrollPane scrollPane = new JScrollPane(textArea);  
        textArea.setLineWrap(true);  
        textArea.setWrapStyleWord(true); 
        scrollPane.setPreferredSize( new Dimension( 500, 500 ) );
        JOptionPane.showMessageDialog(null, scrollPane, "Productos Disponibles", JOptionPane.DEFAULT_OPTION);
    }
    
    public void verMesas(){
        String mesas[][] = main.mesas;
        String mesasMostrar="";
        
        for(int i=0; i<=mesas.length-1; i++){
            mesasMostrar = mesasMostrar+"\n\n";
            for (int j=0; j<=mesas[i].length-1; j++){
                int numMesa = i+j+1;
                mesasMostrar = mesasMostrar +"   Mesa # "+numMesa+"        ";
            }
            mesasMostrar = mesasMostrar +"\n";
            for (int k=0; k<=mesas[i].length-1; k++){
                mesasMostrar = mesasMostrar +mesas[i][k]+"        ";
            }
        }
        
        JOptionPane.showMessageDialog(null, "Mapa de mesas del establecimiento\n\n"+mesasMostrar);
    }
    
    
    
    
    
    private int opcion;

    public void mostrarMenu() {
        //Para el color del JOption
        UIManager UI=new UIManager();
        UI.put("OptionPane.background",new ColorUIResource(153,204,255));
        UI.put("Panel.background",new ColorUIResource(153,204,255)); 
        
        while (opcion != 4) {
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "\n************ Bienvenido al menú de administración ************n\n"
                    + "1.Registrar un nuevo producto\n"
                    + "2.Consultar el menú de productos\n"
                    + "3.Ver mesas\n"
                    + "4. Volver al menú principal\n\n"
                    +"Elija el número de la acción que desea realizar:"));
            switch (opcion) {
                case 1: {
                    IngresarProducto();
                    break;    
                }
                case 2:{
                    mostrarProductos();
                    break;
                }
                case 3:{
                    verMesas();
                    break;
                }
                case 4:{
                    main.menu.mostrarMenu();
                    break;
                }
                default:{
                    JOptionPane.showMessageDialog(null, "Opción no disponible, por favor elija una opción válida");
                }
            }
        }
    }
}
