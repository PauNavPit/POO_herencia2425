package ejercicio3;

import java.time.LocalDate;


public abstract class Producto {

    private LocalDate fecha;
    private int lote;

    public Producto(LocalDate fecha, int lote) {
        this.fecha = fecha;
        this.lote = lote;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "Producto{" + " con fecha=" + fecha + ", lote=" + lote + '}';
    }
}
