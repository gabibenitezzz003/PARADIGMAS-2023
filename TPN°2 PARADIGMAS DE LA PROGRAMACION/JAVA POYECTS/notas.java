//gabriel benitez - ing en sistemas año 2023 tpn°2 ejercicio 6

import java.util.Scanner;

public class notas {
    
    // Método que determina la nota a partir del porcentaje obtenido
    public static void determinarNota() {
        try (Scanner scanner = new Scanner(System.in)) {
            // Se pide al usuario que ingrese el porcentaje obtenido
            System.out.print("Ingrese el porcentaje obtenido: ");
            double porcentaje = scanner.nextDouble();
            
            // Se determina la nota correspondiente al porcentaje
            if (porcentaje >= 90) {
                System.out.println("La nota es A");
            } else if (porcentaje >= 80) {
                System.out.println("La nota es B");
            } else if (porcentaje >= 70) {
                System.out.println("La nota es C");
            } else if (porcentaje >= 60) {
                System.out.println("La nota es D");
            } else {
                System.out.println("La nota es F");
            }
        }
    }
    
    // Método principal
    public static void main(String[] args) {
        determinarNota(); // Se llama al método para determinar la nota
    }
}

