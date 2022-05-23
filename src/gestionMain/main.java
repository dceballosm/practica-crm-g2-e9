package src.gestionMain;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion1;
        
               
        do {
            try {
                System.out.print("\t MENU PRINCIPAL "+"\n1. Registro "+"\n2. Navegar "+"\n3. Salir: \n");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1: 
                        //menuPrincipal();
                        break;
                    case 2: //menu para navegar
                    case 3: break;//SALIR

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 3);
    }
    
}
