package ejercicio3;
import java.time.LocalDate;

public class Congelados extends Producto {
    private String temperatura;


    public Congelados(LocalDate fecha, int lote,int codigo,String nombre,double precio,String temperatura ) {
        super(fecha,lote);
        this.temperatura = temperatura;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }


}
