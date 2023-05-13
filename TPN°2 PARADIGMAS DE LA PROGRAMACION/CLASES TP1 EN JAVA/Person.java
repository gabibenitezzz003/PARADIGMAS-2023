import java.util.Random;

// Clase Persona (clase base)
class Person {
    private String colorPiel; // atributo privado
    private String colorOjo; // atributo privado

    // Constructor de la clase Persona
    public Person() {
        // Asignar color de ojos al azar
        int rand = new Random().nextInt(3);
        if (rand == 0) {
            colorOjo = "verde";
        } else if (rand == 1) {
            colorOjo = "azul";
        } else {
            colorOjo = "marrón";
        }
        // Asignar color de piel al azar
        rand = new Random().nextInt(2);
        if (rand == 0) {
            colorPiel = "claro";
        } else {
            colorPiel = "oscuro";
        }
    }

    // Métodos captadores de los atributos
    public String getColorPiel() {
        return colorPiel;
    }

    public String getColorOjo() {
        return colorOjo;
    }

    // Método para imprimir los atributos de la clase Persona
    public void imprimir() {
        System.out.println("Color de piel: " + colorPiel + ", Color de ojos: " + colorOjo);
    }
}

// Clase Padre, que hereda de la clase Persona
class Padre extends Person {
    // Constructor de la clase Padre
    public Padre() {
        super();
    }

    // Método para imprimir los atributos del Padre
    public void imprimirPadre() {
        System.out.print("Padre - ");
        super.imprimir(); // llamada al método imprimir de la clase Persona
    }
}

// Clase Madre, que hereda de la clase Persona
class Madre extends Person {
    // Constructor de la clase Madre
    public Madre() {
        super();
    }

    // Método para imprimir los atributos de la Madre
    public void imprimirMadre() {
        System.out.print("Madre - ");
        super.imprimir(); // llamada al método imprimir de la clase Persona
    }
}

// Clase Hijo, que hereda de la clase Padre y Madre
class Hijo extends Person {
    // Constructor de la clase Hijo, recibe instancias de Padre y Madre como parámetros
    public Hijo(Padre padre, Madre madre) {
        super(); // llamada al constructor de la clase Persona
        setColorPiel(madre.getColorPiel()); // asignación del color de piel del hijo a partir de la madre
        // cálculo del color de ojos del hijo en función del padre y la madre
        if(padre.getColorOjo().equals(madre.getColorOjo())) {
            setColorOjo(padre.getColorOjo());
        } else {
            setColorOjo("marron");
        }
    }

    private void setColorOjo(String colorOjo) {
    }

    private void setColorPiel(String colorPiel) {
    }

    // Método para imprimir los atributos del Hijo
    public void imprimirHijo() {
        System.out.print("Hijo - ");
        super.imprimir(); // llamada al método imprimir de la clase Persona
    }
}
