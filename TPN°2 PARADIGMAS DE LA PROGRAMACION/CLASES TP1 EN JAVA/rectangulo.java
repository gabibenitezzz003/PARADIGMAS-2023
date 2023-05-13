//gabriel benitez - ing en sistemas año 2023 tpn°2 ejercicio 16



import java.util.Scanner;

public class rectangulo {

    private double base;
    private double altura;

    public rectangulo(double base2, double altura2) {
    }

    public void Rectangulo(double base,double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public static <Rectangulo> void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese la base del rectángulo: ");
            double base = sc.nextDouble();

            System.out.print("Ingrese la altura del rectángulo: ");
            double altura = sc.nextDouble();

            rectangulo rectangulo = new rectangulo(base, altura);

            System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());
            System.out.println("El perímetro del rectángulo es: " + rectangulo.calcularPerimetro());
        }
    }
}