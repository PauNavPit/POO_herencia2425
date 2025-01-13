package ejercicio4;

public abstract class VehiculoMotor extends Vehiculo {
    private String tipomotor;
    private int numMarchas;

    public VehiculoMotor(String tipomotor, int numMarchas) {
        this.tipomotor = tipomotor;
        this.numMarchas = numMarchas;
    }


    public String getTipomotor() {
        return tipomotor;
    }

    public void setTipomotor(String tipomotor) {
        this.tipomotor = tipomotor;
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    @Override
    public String toString() {return "tipo motor: " + tipomotor + ", num marchas: " + numMarchas + super.toString();}


}
