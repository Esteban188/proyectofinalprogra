/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

//Para las ventanas de diálogo
import java.awt.Dimension;
import javax.swing.JOptionPane; 
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//Para el color del JOption
import javax.swing.UIManager; 
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author David
 */
public class MenuCliente {
    private int opcion;
  
    
    
    public void realizarPedido(){
        Pedido pedido = new Pedido();
        double precios[] = new double[30]; //30 es el máximo porque puede agregar 10 productos de cada tipo al pedido
        int indicePrecios = 0;
        
        int opcionPedido=1;
        while (opcionPedido != 4) {
           
            opcionPedido = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "\n*         Realizar pedido         *\n\n"
                    + "1.Agregar una pizza\n"
                    + "2.Agregar una lasagna\n"
                    + "3.Agregar una bebida\n"
                    + "4.Cerrar pedido\n"
                    + "5.Cancelar pedido\n\n"
                    +"Elija el número de la acción que desea realizar:"));
            switch (opcionPedido) {
                
                case 1: {
                    
                    //Saca los datos de las pizzas
                    Pizza pizzas[] = new Pizza[10];
                    pizzas = Menu.menuProductos.getPizzas();
                    int cantidadPizzas = pizzas.length;

                    String mensajePizzas = "\n\n*****PIZZAS*****";
                    for (int i=0; i<=cantidadPizzas-1; i++){ 
                        if(pizzas[i]!=null){ 
                            mensajePizzas = mensajePizzas+"\n"+pizzas[i].getPizza();
                        }   
                    }
                    
                    //Muestra todas las pizzas es un textArea con scroll
                    JTextArea textArea = new JTextArea(mensajePizzas);
                    JScrollPane scrollPane = new JScrollPane(textArea);  
                    textArea.setLineWrap(true);  
                    textArea.setWrapStyleWord(true); 
                    scrollPane.setPreferredSize( new Dimension( 500, 500 ) );
                    //Pide el ID de la pizza 
                    int opcionPizza=Integer.parseInt(JOptionPane.showInputDialog(null, scrollPane, "Ingrese el ID de la pizza que desea", JOptionPane.DEFAULT_OPTION));
                    
                    String mensaje;
                    int indice=-1;
                  //Busca el ID en el menu del restaurante
                    for (int i=0; i<=cantidadPizzas-1; i++){
                        
                        //Si encuentra la pizza guarda el ID
                        if (pizzas[i]!=null){
                            if (pizzas[i].getID()==opcionPizza){
                                indice=i;
                        }
                        }
                        
                    }
                    
                    if (indice>=0){
                        mensaje = pedido.agregarPizza(pizzas[indice]); //Agrega la pizza al pedido
                        precios[indicePrecios] = pizzas[indice].getPrecio(); //Agrega el precio del producto al arreglo de precios
                        indicePrecios++;
                    }
                    else{
                        mensaje="El ID indicado no corresponde a ninguna pizza en el menú.";
                    }
                    JOptionPane.showMessageDialog(null, mensaje);
                    break;    
                }
                case 2:{
                    //Saca los datos de las lasagna
                    Lasagna lasagnas[] = new Lasagna[10];
                    lasagnas = Menu.menuProductos.getLasagnas();
                    int cantidadLasagnas = lasagnas.length;

                    String mensajeLasagnas = "\n\n*****Lasagnas*****";
                    for (int i=0; i<=cantidadLasagnas-1; i++){
                        if(lasagnas[i]!=null){
                            mensajeLasagnas = mensajeLasagnas+"\n"+lasagnas[i].getLasagna();
                        }   
                    }
                    
                    //Muestra todas las lasagnas es un textArea con scroll
                    JTextArea textArea = new JTextArea(mensajeLasagnas);
                    JScrollPane scrollPane = new JScrollPane(textArea);  
                    textArea.setLineWrap(true);  
                    textArea.setWrapStyleWord(true); 
                    scrollPane.setPreferredSize( new Dimension( 500, 500 ) );
                    //Pide el ID de la pizza 
                    int opcionLasagna=Integer.parseInt(JOptionPane.showInputDialog(null, scrollPane, "Ingrese el ID de la lasagna que desea", JOptionPane.DEFAULT_OPTION));
                    
                    String mensaje;
                    int indice=-1;
                    //Busca el ID en el menu del restaurante
                    for (int i=0; i<=cantidadLasagnas-1; i++){
                        //Si encuentra la pizza guarda el ID
                        if (lasagnas[i]!=null){
                            if (lasagnas[i].getID()==opcionLasagna){
                                indice=i;
                            }
                        }
                    }
                    
                    if (indice>=0){
                        mensaje = pedido.agregarLasagna(lasagnas[indice]); //Agrega la lasagna al pedido
                        precios[indicePrecios] = lasagnas[indice].getPrecio(); //Agrega el precio de la lasagna a la lista de precios
                        indicePrecios++;
                    }
                    else{
                        mensaje="El ID indicado no corresponde a ninguna lasagna en el menú.";
                    }
                    JOptionPane.showMessageDialog(null, mensaje);
                    break;
                }
                case 3:{
                    //Saca los datos de las bebidas
                    Bebida bebidas[] = new Bebida[10];
                    bebidas = Menu.menuProductos.getBebidas();
                    int cantidadBebidas = bebidas.length;

                    String mensajeBebidas = "\n\n*****PIZZAS*****";
                    for (int i=0; i<=cantidadBebidas-1; i++){
                        if(bebidas[i]!=null){
                            mensajeBebidas = mensajeBebidas+"\n"+bebidas[i].getBebida();
                        }   
                    }
                    
                    //Muestra todas las bebidas es un textArea con scroll
                    JTextArea textArea = new JTextArea(mensajeBebidas);
                    JScrollPane scrollPane = new JScrollPane(textArea);  
                    textArea.setLineWrap(true);  
                    textArea.setWrapStyleWord(true); 
                    scrollPane.setPreferredSize( new Dimension( 500, 500 ) );
                    //Pide el ID de la pizza 
                    int opcionBebida=Integer.parseInt(JOptionPane.showInputDialog(null, scrollPane, "Ingrese el ID de la bebida que desea", JOptionPane.DEFAULT_OPTION));
                    
                    String mensaje;
                    int indice=-1;
                    //Busca el ID en el menu del restaurante
                    for (int i=0; i<=cantidadBebidas-1; i++){
                        if (bebidas[i]!=null){
                            //Si encuentra la pizza guarda el ID
                            if (bebidas[i].getID()==opcionBebida){
                            
                                indice=i;
                            }
                        }
                    }
                    
                    if (indice>=0){
                        mensaje = pedido.agregarBebida(bebidas[indice]); //Agrega la bebida al pedido
                        precios[indicePrecios] = bebidas[indice].getPrecio(); //Agrega el precio al arreglo de precios
                        indicePrecios++;
                    }
                    else{
                        mensaje="El ID indicado no corresponde a ninguna bebida en el menú.";
                    }
                    JOptionPane.showMessageDialog(null, mensaje);
                    break;
                }
                case 4:{
                    String nombre = JOptionPane.showInputDialog(null,"Para finalizar el pedido por favor proceda a llenar sus datos, digite su nombre:\n");
                    String direccion = JOptionPane.showInputDialog(null, "Por favor ingrese su dirección: ");
                    int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese su número de teléfono: \n"));
                    int cedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su número de cédula: \n"));
                    
                    Cliente cliente = new Cliente(nombre, direccion, telefono, cedula);
                    
                    pedido.setCliente(cliente);
                    
                    //Para asignar número de mesa 
                    String mesas[][] = main.mesas;
                    
                    for (int i=0; i<=mesas.length-1; i++){
                        for (int j=0; j<=mesas[i].length-1; j++){
                            if (mesas[i][j].equals("Disponible")){
                                int numeroMesa = i+j+1;
                                pedido.setNumeroMesa(numeroMesa);
                                main.mesas[i][j] = cliente.getNombre();
                                
                                JOptionPane.showMessageDialog(null, "¡Su pedido se procesó exitosamente!");
                                
                                //Sacamos el total a pagar recorriendo el arreglo de precios
                                double total = 0.0;
                                for (int k=0; k<=precios.length-1; k++){
                                   
                                    total = total + precios[k];
                                }
                                
                                //formamos la factura con todos los datos en un scroll
                                String mensaje = "FACTURA DE PAGO\n\n"+pedido.getPedidoCompleto() +"\n\nTotal: "+total+"\nNúmero de mesa: "+numeroMesa;
                                //Mostramos la factura del pedido en un scroll
                                
                                JTextArea textArea = new JTextArea(mensaje);
                                JScrollPane scrollPane = new JScrollPane(textArea);  
                                textArea.setLineWrap(true);  
                                textArea.setWrapStyleWord(true); 
                                scrollPane.setPreferredSize( new Dimension( 500, 500 ) );
                                JOptionPane.showMessageDialog(null, scrollPane, "Factura", JOptionPane.DEFAULT_OPTION);
                                break;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 5:{
                    main.menu.mostrarMenu();
                    break;
                }
                default:{
                    JOptionPane.showMessageDialog(null,"Opción no disponible, por favor elija una opción válida");
                }
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
            if(pizzas[i]!=null){
                mensajePizzas = mensajePizzas+"\n"+pizzas[i].getPizza();
            }   
        }
        
        //Saca los datos de las lasagnas
        Lasagna lasagnas[] = new Lasagna[10];
        lasagnas = Menu.menuProductos.getLasagnas();
        int cantidadLasagnas = lasagnas.length;
        
        String mensajeLasagnas = "\n\n*****LASAGNAS*****";
        for (int i=0; i<=cantidadLasagnas-1; i++){
            if (lasagnas[i]!=null){
                mensajeLasagnas = mensajeLasagnas+"\n"+lasagnas[i].getLasagna();
            }
        }
        
        //Saca los datos de las bebidas
        Bebida bebidas[] = new Bebida[10];
        bebidas = Menu.menuProductos.getBebidas();
        int cantidadBebidas = bebidas.length;
        
        String mensajeBebidas = "\n\n*****BEBIDAS*****";
        for(int i=0; i<=cantidadBebidas-1; i++){
            if(bebidas[i]!=null){
                mensajeBebidas = mensajeBebidas+"\n"+bebidas[i].getBebida();
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

    public void mostrarMenu() {
       
        //Para el color del JOption
        UIManager UI=new UIManager();
        UI.put("OptionPane.background",new ColorUIResource(201,204,255));
        UI.put("Panel.background",new ColorUIResource(201,204,255)); 
        
        while (opcion != 3) {
           
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "\n*         Bienvenido al menú de Clientes         *\n\n"
                    + "1.Realizar un nuevo pedido\n"
                    + "2.Ver productos disponibles\n"
                    + "3.Volver al menú principal\n"
                    + "4.Salir\n\n"
                    +"Elija el número de la acción que desea realizar:"));
            switch (opcion) {
                case 1: {
                    realizarPedido();
                    break;    
                }
                case 2:{
                    mostrarProductos();
                    break;
                }
                case 3:{
                    main.menu.mostrarMenu();
                    break;
                }
                case 4:{
                    JOptionPane.showMessageDialog(null, " ¡Gracias por usar el sistema, vuelva pronto! :)");
                    System.exit(0);
                    break;
                }
                default:{
                    JOptionPane.showMessageDialog(null,"Opción no disponible, por favor elija una opción válida");
                }
            }
        }
    }
}
