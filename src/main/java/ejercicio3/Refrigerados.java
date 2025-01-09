package ejercicio3;
import java.time.LocalDate;

public class Refrigerados extends Producto {
    private int codigo;


    public Refrigerados(LocalDate fecha, int lote,int codigo ) {
        super(fecha,lote);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


}
