package ejercicio4;

public class Coche extends VehiculoMotor {
    private String matricula;

    public Coche(String tipomotor, int numMarchas, String matricula) {
        super(tipomotor, numMarchas);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }


    @Override
    public boolean subir(int unidades) {
        setVelocidad(getVelocidad()+unidades);
        return true;
    }

    @Override
    public boolean bajar(int unidades) {
        if (getVelocidad() - unidades < 0) {
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
    public String toString() {return "Coche con matricula: " + matricula + super.toString();}


}