//gabriel benitez - ing en sistemas año 2023 tpn°2 ejercicio 4

import java.util.Scanner;

public class Suma_Multiplic {

    public static void main(String[] args) {
        calcularSumaYMultiplicacion();
    }
    
    public static void calcularSumaYMultiplicacion() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa el primer número: ");
            double numero1 = scanner.nextDouble();
            System.out.print("Ingresa el segundo número: ");
            double numero2 = scanner.nextDouble();
            
            double suma = numero1 + numero2;
            double multiplicacion = numero1 * numero2;
            
            System.out.println("La suma de los números es: " + suma);
            System.out.println("La multiplicación de los números es: " + multiplicacion);
        }
    }

}
