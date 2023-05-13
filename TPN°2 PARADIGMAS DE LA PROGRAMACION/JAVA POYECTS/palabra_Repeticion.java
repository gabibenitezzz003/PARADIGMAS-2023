//gabriel benitez - ing en sistemas año 2023 tpn°2 ejercicio 8

import java.util.Scanner;

public class palabra_Repeticion{
    public static void main(String[] args) {
        try (// leo la entrada del usuario
        Scanner scanner = new Scanner(System.in)) {
            // Pido al usuario que ingrese una palabra 
            System.out.print("Ingrese una palabra: ");
            String palabra = scanner.next();

            // se imprime la palabra 20 veces seguidas utilizando un bucle for
            for (int i = 0; i < 20; i++) {
                System.out.print(palabra);
            }

            // Imprimo la palabra 20 veces, cada vez en una línea diferente utilizando un bucle for 
            for (int i = 0; i < 20; i++) {
                System.out.println(palabra);
            }
        }
    }
}

