//gabriel benitez - ing en sistemas año 2023 tpn°2 ejercicio 12


import java.util.Scanner;

public class marca_Autos{
    public static void main(String[] args) {
        String[] mejoresMarcas = {"Toyota", "Honda", "Ford", "Chevrolet", "Nissan"};

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la marca de su auto: ");
            String marca = scanner.nextLine();

            boolean esMejorMarca = false;
            for (int i = 0; i < mejoresMarcas.length; i++) {
                if (marca.equalsIgnoreCase(mejoresMarcas[i])) {
                    esMejorMarca = true;
                    break;
                }
            }

            if (esMejorMarca) {
                System.out.println("¡Felicitaciones! Su auto es una de las mejores marcas.");
            } else {
                System.out.println("Lo siento, su auto no está entre las mejores marcas.");
            }
        }
    }
}
