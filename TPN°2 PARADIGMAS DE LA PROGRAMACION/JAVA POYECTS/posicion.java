//gabriel benitez - ing en sistemas año 2023 tpn°2 ejercicio 10

import java.util.Scanner;

public class posicion {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[10];

            // Pedir al usuario que ingrese 10 números y guardarlos en el arreglo "numeros"
            for (int i = 0; i < 10; i++) {
                System.out.print("Ingrese un número: ");
                numeros[i] = scanner.nextInt();
            }

            // Pedir al usuario que ingrese una posición de elemento y guardarla en la variable "posicion"
            System.out.print("Ingrese una posición de elemento: ");
            int posicion = scanner.nextInt();

            // Mostrar el elemento en la posición ingresada por el usuario en el arreglo "numeros"
            System.out.println("El elemento en la posición " + posicion + " es: " + numeros[posicion]);
        }
    }
}
