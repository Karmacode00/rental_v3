package Logica;

import java.util.ArrayList;

public class Vehiculo {
    private String patente;
    private char condicion;
    private static ArrayList<Vehiculo> listaVehiculos;
    private static char disponible = 'D';
    private static char arrendado = 'A';

    public Vehiculo(String patente, char condicion) {
        this.patente = patente;
        this.condicion = condicion;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public char getCondicion() {
        return condicion;
    }

    public void setCondicion(char condicion) {
        this.condicion = condicion;
    }

    public Boolean validarDisponibilidadVehiculo(Vehiculo vehiculo) {
        if (vehiculo.getCondicion() == disponible) {
            return true;
        }
        return false;
    }

    public static Vehiculo getVehiculo(String patente) {
        if (listaVehiculos == null)
            initVehiculos();
        for (int i = 0; i < listaVehiculos.size(); i++) {
            if (listaVehiculos.get(i).getPatente().equals(patente)) {
                return listaVehiculos.get(i);
            }
        }
        return null;
    }

    public static void initVehiculos() {

        listaVehiculos = new ArrayList<Vehiculo>();
        Vehiculo vehiculo1 = new Vehiculo("IVS967", disponible);
        Vehiculo vehiculo2 = new Vehiculo("SFE157", arrendado);

        listaVehiculos.add(vehiculo1);
        listaVehiculos.add(vehiculo2);
    }

    public static ArrayList<Vehiculo> getVehiculos() {
        return listaVehiculos;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", condicion=" + condicion + '}';
    }
}
