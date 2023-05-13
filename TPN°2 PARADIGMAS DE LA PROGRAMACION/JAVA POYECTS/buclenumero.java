//gabriel benitez - ing en sistemas año 2023 tpn°2 ejercicio 13

import java.util.Scanner;
public class buclenumero{
    public static void main(String[] args) {
        try (Scanner Scanner = new Scanner(System.in)) {
            int numero = 0; // Iniciamos la variable numero con un valor de cero

            while (numero != 9) { // Creamos un bucle while que se ejecutará mientras el número ingresado por el usuario no sea 9
                System.out.print("Ingrese un número: "); // Pedir al usuario que ingrese un número
                numero = Scanner.nextInt(); // Leer el número ingresado por el usuario y asignarlo a la variable numero
            }
        }

        System.out.println("¡Ha ingresado el número 9!"); // Mostrar un mensaje de confirmación cuando el usuario ingrese el número 9
    }
}
