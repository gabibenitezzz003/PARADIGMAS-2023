//gabriel benitez - ing en sistemas año 2023 tpn°2 ejercicio 11

import java.util.Scanner;

public class gastos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] gastos = new double[6]; // Se crea un array para guardar los gastos

            // Pedir al usuario que ingrese los gastos de los últimos 6 meses
            for (int i = 0; i < gastos.length; i++) {
                System.out.print("Ingrese el gasto del mes " + (i+1) + ": ");
                gastos[i] = scanner.nextDouble();
            }

            // Calcular la suma total de los gastos
            double suma = 0;
            for (double gasto : gastos) {
                suma += gasto;
            }

            // Mostrar el resultado al usuario
            System.out.println("El gasto total de los últimos 6 meses es de: $" + suma);
        }
    }
}
