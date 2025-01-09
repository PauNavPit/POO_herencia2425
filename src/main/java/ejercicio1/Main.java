package ejercicio1;

public class Main {
    public static void main(String[] args) {
    Persona xavi = new Persona("x","r","11U",25);
    Persona xavi2 = new Persona("x","r","11U",52);

        System.out.println(xavi);
        System.out.println(xavi2);

        System.out.println("Iguales? " + xavi.equals(xavi2));

        Profesor pau = new Profesor("Pau","Navarro","1234df",31,null);

        pau.setGradosImparte(Grado.PRIMERO_ASIR,Grado.PRIMERO_DAW);
        System.out.println(pau);

        Alumno juan = new Alumno("Juan","Juan","1234df",31,Grado.PRIMERO_DAW,1);
        Alumno toni = new Alumno("Juan","Juan","1234df",31,Grado.PRIMERO_DAW);

        System.out.println(toni);
        System.out.println(juan);

        xavi.imprimirDNI();
        pau.imprimirDNI();
        juan.imprimirDNI();





        Persona xabi = new Profesor("Xabi","lopez","910",55,new Grado[]{Grado.SEGUNDO_ASIR});
        System.out.println(xabi);
        xabi.imprimirDNI();


        Directivo sebas = new Directivo("Sebas","Pia","1234t",40,new Grado[]{Grado.SEGUNDO_ASIR},"Director");
        System.out.println(sebas);
        sebas.imprimirDNI();
    }
}
