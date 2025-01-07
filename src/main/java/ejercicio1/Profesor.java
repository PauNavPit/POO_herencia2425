package ejercicio1;

public class Profesor extends Persona {
    private Grado[] grados;

    public Profesor(String nombre, String apellidos, String dni, int edad, Grado[] grados) {
        super(nombre, apellidos, dni, edad);
        this.grados = grados;
    }

    public Grado[] getGrados() {
        return grados;
    }
}

