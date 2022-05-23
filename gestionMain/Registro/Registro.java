package gestionMain.Registro;

import java.util.Scanner;

public  class Registro {
    public static  void registro() {
        Scanner scan = new Scanner(System.in);
        int opcion1;
        
               
        do {
            try {
                System.out.print("\t MENU REGISTRO " + "\n1. Registrar Empleados " + "\n2. Registrar Empresa " + "\n3. Registrar Servicios: " + "\n4. Registrar Promocion: "+ "\n5. Salir \n");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1: 
                        RegistroEmpleado.registrarEmpleado();
                        break;
                    case 2: 
                        RegistroEmpresa.registrarEmpresa();
                        break;
                    
                    case 3: 
                        RegistroServicios.registrarServicios();
                        break;
                    case 4:
                        RegistroPromocion.registrarProcion();
                        break;
                    case 5:
                        break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 5);
    

    }
}
