package ejercicio1;

public class Alumno extends Persona {
    private int NIA;
    private Grado grado;

    public Alumno(String nombre, String apellidos, String DNI, int edad,  Grado grado){
        super(nombre,apellidos,DNI,edad);
        this.grado = grado;
        this.NIA = generarNIA();
    }

    public Alumno(String nombre, String apellido,String DNI, int edad,Grado grado, int NIA){
        super(nombre,apellido,DNI,edad);
        this.grado = grado;
        this.NIA = NIA;
    }

    private int generarNIA(){
        return (int)(Math.random()*10000000);
    }

    @Override
    public void imprimirDNI(){
        System.out.println("Desde la clase Alumno imprimo DNI " + this.getDni());
    }

    @Override
    public String toString() {

        return "Alumno con" + " NIA " + NIA + ", en el grado " + grado + " de nommbre " + super.toString();
    }

}
