package TA13;

public class Main {

    public static void main(String[] args){

        Vehiculo dueño = new Vehiculo("André", 72948145,20);

        dueño.setMultas(0);
        dueño.setVehiculo("Cb190r");
        dueño.setPlaca("6655IQ");
        System.out.println("Dueño: "+dueño.getNombre());
        System.out.println("Dni: "+dueño.getDni());
        System.out.println("Edad: "+dueño.getEdad()+" años");
        System.out.println("Multas: "+dueño.getMultas());
        System.out.println("Vehiculo: "+dueño.getVehiculo());
        System.out.println("Placa: "+dueño.getPlaca());

    }
}
