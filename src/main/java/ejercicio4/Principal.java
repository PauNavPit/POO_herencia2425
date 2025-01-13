package ejercicio4;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Coche ibiza = new Coche("combustion",5,"99999A");
        Coche kia = new Coche("kia",5,"99999B");
        Bicicleta bici = new Bicicleta("Rockryder");

        System.out.println(bici);
        bici.subir1();
        bici.subir(3);
        bici.subir(5);

        System.out.println(bici);

        System.out.println(ibiza);
        ibiza.subir(5);
        ibiza.subir1();
        ibiza.subir(50);
        System.out.println(ibiza);


        System.out.println(kia);
        kia.subir(5);
        kia.subir1();
        kia.bajar1();
        kia.subir(50);
        System.out.println(kia);



        //ejemplo de polimorfismo
        Vehiculo mercedes = new Coche("Electrico",0,"5555ACME");
        Vehiculo[] concesionario = {ibiza, kia, bici, mercedes};
        System.out.println(Arrays.toString(concesionario));

        int suma = 0;
        for (Vehiculo vehiculo : concesionario) {
            suma+= vehiculo.getVelocidad();}
            System.out.println("Media : "+ ((double)suma/concesionario.length));
        }
    }

