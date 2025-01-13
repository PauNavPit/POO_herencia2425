package ejercicio3;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Fresco extends Producto {

    private LocalDate fechaenvasado;
    private String pais;



public Fresco(LocalDate fecha, int lote,LocalDate fechaenvasado, String pais) {
    super(fecha,lote);
    this.fechaenvasado = fechaenvasado;
    this.pais = pais;
}

    public LocalDate getFechaenvasado() {
        return fechaenvasado;
    }

    public void setFechaenvasado(LocalDate fechaenvasado) {
        this.fechaenvasado = fechaenvasado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public void ponerPrecio(double precio) {
    this.precio = precio;

    }


    @Override
    public String toString() {
        return  super.toString()+ " Producto fresco " + " con fecha de envasado " + getFechaenvasado() + " del pais " + getPais() +'}';
    }



}
