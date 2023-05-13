//gabriel benitez - ing en sistemas año 2023 tpn°2 ejercicio 14


public class NumerosPerfectos {
    public static void main(String[] args) {
        int sumaDivisores;

        // Iterar por los números del 1 al 500
        for (int numero = 1; numero <= 500; numero++) {
            sumaDivisores = 0;

            // Encontrar los divisores propios del número
            for (int divisor = 1; divisor <= numero / 2; divisor++) {
                if (numero % divisor == 0) {
                    sumaDivisores += divisor;
                }
            }

            // Comprobar si el número es perfecto
            if (sumaDivisores == numero) {
                System.out.println(numero + " es un número perfecto.");
            }
        }
    }
}
