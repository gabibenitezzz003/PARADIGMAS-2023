//gabriel benitez - ing en sistemas año 2023 tpn°2 ejercicio 9

import java.util.Scanner;

public class recorrido_Palabra {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese una palabra: ");
            String palabra = scanner.next();

            // muestra cada letra de la palabra en una línea diferente
            for (int i = 0; i < palabra.length(); i++) {
                System.out.println(palabra.charAt(i));
            }
        }
    }
}