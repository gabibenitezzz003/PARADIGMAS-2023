//gabriel benitez - ing en sistemas año 2023 tpn°2 ejercicio 17



import java.util.Scanner;

public class Empleado {
    private String nombre;
    private int horasTrabajadas;
    private double tarifaHora;

    public Empleado(String nombre, int horasTrabajadas, double tarifaHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    public double calcularSalario() {
        return horasTrabajadas * tarifaHora;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el nombre del empleado: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese las horas trabajadas: ");
            int horasTrabajadas = sc.nextInt();

            System.out.print("Ingrese la tarifa por hora: ");
            double tarifaHora = sc.nextDouble();

            Empleado empleado = new Empleado(nombre, horasTrabajadas, tarifaHora);

            System.out.println("El salario de " + empleado.nombre + " es: $" + empleado.calcularSalario());
        }
    }
}
