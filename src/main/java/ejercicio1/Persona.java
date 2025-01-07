package ejercicio1;

public class Persona {

    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;

    public Persona(String nombre, String apellidos, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void cumplirAnyos() {
        edad++;
    }

    public void imprimirDNI() {
        System.out.println("Desde la clase Persona imprimo DNI: " + dni);

    }

    @Override
    public String toString() {
        return "Persona: " + nombre + " " + apellidos + " con DNI " + dni + " y edad " + edad;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || !(object instanceof Persona))
            return false;
        Persona persona = (Persona) object;
        return this.nombre.equals(persona.getNombre()) && this.apellidos.equals(persona.getApellidos()) && this.dni.equals(persona.getDni());
    }
}