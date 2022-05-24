package gestionMain.Clientes;

import java.util.Scanner;

public class Clientes {
    public static  void clientes() {
        Scanner scan = new Scanner(System.in);
        int opcion1;
        
               
        do {
            try {
                System.out.print("\t MENU CLIENTES " + "\n1. Consultar Clientes: " + "\n2. Clientes Potenciales: " + "\n3. Consultar Ventas: "+ "\n4. Servicio de Clientes: " + "\n5. Salir \n");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1: 
                        ConsultarClientes.consultarClientes();
                        break;
                    case 2: 
                        ClientesPotenciales.clientesPotenciales();
                        break;
                    case 3: 
                        ConsultarVentas.consultarVentas();
                        break;
                    case 4: 
                        ServiciosClientes.serviciosClientes();
                        break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 5);
    

    }
    
}
