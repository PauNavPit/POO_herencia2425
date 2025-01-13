package ejercicio3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Fresco producto1 = new Fresco(LocalDate.of(2024,10,10),23,LocalDate.of(2024,12,12),"España");
        System.out.println(producto1);
        producto1.ponerPrecio(1.20);
        System.out.println(producto1);
        System.out.println(producto1.precio);

    }
}


