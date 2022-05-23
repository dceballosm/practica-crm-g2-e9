package gestionMain.Eventos;

import java.util.Scanner;

public class Eventos {
    public static  void eventos() {
        Scanner scan = new Scanner(System.in);
        int opcion1;
        
               
        do {
            try {
                System.out.print("\t MENU EVENTOS " + "\n1. Añadir Eventos: " + "\n2. Estado de Eventos: " + "\n3. Modificar Eventos: " + "\n4. Salir \n");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1: 
                        AñadirEvento.añadirEvento();
                        break;
                    case 2: 
                        EstadoEvento.cursoEvento();
                        break;
                    case 3: 
                        ModificarEvento.modificarEvento();
                        break;
                    case 4: break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 4);
    

    }
    
}
