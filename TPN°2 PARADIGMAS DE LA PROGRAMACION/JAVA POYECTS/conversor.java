//gabriel benitez - ing en sistemas año 2023 tpn°2 ejercicio 2

import java.util.Scanner;
public class conversor {
    // Constante que representa la relación entre una pulgada y un metro.
    private static final double PULGADA_METRO = 0.0254;

    public static void main(String[] args) {
      try (Scanner Scanner = new Scanner(System.in)) {
        System.out.print("Ingresa la medida en pulgadas: ");
        double pulgadas = Scanner.nextDouble();
 
        double metros = pulgadas * PULGADA_METRO;
 
        System.out.println(pulgadas + " pulgadas son " + metros + " metros.");
      }
    }
  }
  