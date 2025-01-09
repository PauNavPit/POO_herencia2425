package ejercicio1;

import java.util.Arrays;

public class Profesor extends Persona {
    private Grado[] gradosImparte;

    public Profesor(String nombre, String apellidos, String dni, int edad, Grado[] grados) {
        super(nombre, apellidos, dni, edad);
        this.gradosImparte = grados;

    }


    public Grado[] getGradosImparte() {
        return gradosImparte;
    }

    public void setGradosImparte(Grado... gradosImparteVector) {
        this.gradosImparte = gradosImparteVector;
    }

    @Override
    public void imprimirDNI(){
        System.out.println("Desde la clase profesor imprimo DNI " + this.getDni());
    }

    @Override
    public String toString() {

        return "Profesor " + Arrays.toString(gradosImparte) + " " + super.toString();
    }

}







