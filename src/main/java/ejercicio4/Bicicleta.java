package ejercicio4;

public class Bicicleta extends Vehiculo {
    private String tipo;

    public Bicicleta(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    @Override
    public boolean subir(int unidades) {
        setVelocidad(getVelocidad()+unidades);
        return true;
    }

    @Override
    public boolean bajar(int unidades) {
        if (getVelocidad() - unidades < 0 || unidades > 4) {
            return false;
        }

        setVelocidad(getVelocidad() - unidades);
        return true;
    }
    @Override
    public void arrancar(){
        if(getVelocidad()==0)
            setVelocidad(1);
    }




@Override
    public String toString() {return "Bicicleta de tipo "+ tipo +super.toString();}

}
