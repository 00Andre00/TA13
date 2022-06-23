package TA13;

public class Vehiculo extends Dueño{

    protected int multas;
    protected String placa;
    protected String vehiculo;
    public Vehiculo(String nombre, int dni, int edad){
        super(nombre, edad, dni);

    }

    public int getMultas() {
        return multas;
    }
    public void setMultas(int multas) {
        this.multas = multas;
    }

    public String getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
