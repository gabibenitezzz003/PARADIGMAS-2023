    //gabriel benitez - ing en sistemas año 2023 tpn°2 ejercicio 3
    
    // clase del circulo//
    public class circulo {
        // aca ve el numero que representa el valor de PI.//

        private static final double PI = 3.14159;

        // aca ponemos el radio del circulo.//
        private double radio = 5.0;

        // Método que calcula el área del círculo.//
        public double calcularArea() {
            double area = PI * radio * radio;
            return area;
        }

        public static void main(String[] args) {
            // Crear una instancia de la clase Circulo.//
            circulo circulo = new circulo();

            // Calcular el área del círculo.//
            double area = circulo.calcularArea();

            // Imprime el resultado en pantalla.//
            System.out.println("El área del círculo es: " + area);
        }

}
