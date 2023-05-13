//gabriel benitez - ing en sistemas año 2023 tpn°2 ejercicio 1

import java.util.Scanner;

public class hola_Pepe {
    public static void main(String[] args) {
        final String MENSAJE = "Hola Pepe, tanto tiempo!";
        System.out.println(MENSAJE);
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa tu nombre: ");
            String nombre = scanner.nextLine();
            
            String mensajePersonalizado = String.format("Hola %s, tanto tiempo!", nombre);
            System.out.println(mensajePersonalizado);
        }
    }
}