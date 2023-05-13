//gabriel benitez - ing en sistemas año 2023 tpn°2 ejercicio 5
import java.util.Scanner;

public class cono {

    // Definimos PI con el valor 3.1416
    private static final double PI = 3.1416;

    public static void main(String[] args) {

        try (// CreO una instancia de Scanner para leer los datos ingresados por el usuario
        Scanner Scanner = new Scanner(System.in)) {
            // Pedimos al usuario que ingrese el radio del cono
            System.out.print("Ingresa el radio del cono: ");
            double radio = Scanner.nextDouble();

            // Pedimos al usuario que ingrese la altura del cono
            System.out.print("Ingresa la altura del cono: ");
            double altura = Scanner.nextDouble();

            // Calculamos el volumen del cono utilizando la fórmula 
            double volumen = (1.0 / 3.0) * PI * radio * radio * altura;

            // Imprimimos el resultado en pantalla
            System.out.println("El volumen del cono es: " + volumen);
        }
    }
}
