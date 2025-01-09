package ejercicio1;

import java.util.Arrays;

public class Directivo extends Profesor {
    private String cargo;

    public Directivo(String nombre, String apellidos, String dni, int edad, Grado[] grados, String cargo) {
        super(nombre, apellidos, dni, edad,grados);
        this.cargo = cargo;

    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void imprimirDNI(){
        System.out.println("Desde la clase directivo imprimo DNI " + this.getDni());
    }

    @Override
    public String toString() {

        return "Esta a cargo de  " +  cargo  + " el  " + super.toString();
    }



}
