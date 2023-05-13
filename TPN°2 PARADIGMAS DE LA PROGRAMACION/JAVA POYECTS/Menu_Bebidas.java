//gabriel benitez - ing en sistemas año 2023 tpn°2 ejercicio 7

import java.util.Scanner;

public class Menu_Bebidas{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bienvenido al kiosquito gabi! Por favor elija su bebida:");
            System.out.println("1. Jugo de naranja");
            System.out.println("2. Licuado de banana");
            System.out.println("3. Licuado verde");
            System.out.println("4. Jugo de apio y manzana");
            System.out.println("5. Leche de canela");
            
            int opcion = scanner.nextInt();
                   
                
            switch (opcion) {
                case 1:
                    System.out.println("Usted se compro un jugo de naranja");
                    break;
                case 2:
                    System.out.println("Usted se compro un licuado de banana");
                    break;
                case 3:
                    System.out.println("Usted se compro un licuado verde");
                    break;
                case 4:
                    System.out.println("Usted se compro un jugo de apio y manzana");
                    break;
                case 5:
                    System.out.println("Usted se compro una leche de canela");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
        
    }
}
