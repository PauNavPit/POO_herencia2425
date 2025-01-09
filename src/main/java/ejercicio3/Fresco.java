package ejercicio3;
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
    public String toString() {
        return "Producto{" + " con fecha=" + fecha + ", lote=" + lote + '}';
    }



}
