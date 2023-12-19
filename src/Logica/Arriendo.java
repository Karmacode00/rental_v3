package Logica;

import java.util.ArrayList;

import javax.swing.*;

public class Arriendo {
    private static ArrayList<Arriendo> listaArriendos;
    private int numArriendo;
    private String fecArr;
    private int diasArriendo;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private double montoTotal;
    private int cantCuotas;
    private ArrayList<CuotaArriendo> cuotasArriendo;

    public Arriendo(int numArriendo, String fecArr, int diasArriendo, Cliente cliente, Vehiculo vehiculo,
            double montoTotal,
            int cantCuotas, ArrayList<CuotaArriendo> cuotasArriendo) {
        this.numArriendo = numArriendo;
        this.fecArr = fecArr;
        this.diasArriendo = diasArriendo;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.montoTotal = montoTotal;
        this.cantCuotas = cantCuotas;
        this.cuotasArriendo = cuotasArriendo;
    }

    public int getNumArriendo() {
        return numArriendo;
    }

    public void setNumArriendo(int numArriendo) {
        this.numArriendo = numArriendo;
    }

    public String getFecArr() {
        return fecArr;
    }

    public void setFecArr(String fecArr) {
        this.fecArr = fecArr;
    }

    public int getDiasArriendo() {
        return diasArriendo;
    }

    public void setDiasArriendo(int diasArriendo) {
        this.diasArriendo = diasArriendo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public ArrayList<CuotaArriendo> getCuotasArriendo() {
        return cuotasArriendo;
    }

    public void setCuotasArriendo(ArrayList<CuotaArriendo> cuotasArriendo) {
        this.cuotasArriendo = cuotasArriendo;
    }

    public static Boolean validarArriendo(Cliente clienteEncontrado, Vehiculo vehiculoEncontrado) {
        if (clienteEncontrado == null || vehiculoEncontrado == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar Cliente y Vehiculo para continuar");
            return false;
        }

        Boolean clienteVigente = clienteEncontrado.getVigente();
        Boolean vehiculoDisponible = vehiculoEncontrado.validarDisponibilidadVehiculo(vehiculoEncontrado);

        if (clienteVigente && vehiculoDisponible) {
            return true;
        } else if (!clienteVigente) {
            JOptionPane.showMessageDialog(null, "El Cliente seleccionado no está vigente");
            return false;
        } else {
            JOptionPane.showMessageDialog(null, "El Vehiculo seleccionado no está disponible");
            return false;
        }
    }

    public static void initArriendos() {
        listaArriendos = new ArrayList<Arriendo>();
    }

    public static ArrayList<Arriendo> getArriendos() {
        return listaArriendos;
    }

    public static ArrayList<Arriendo> getArriendosPorCliente(Cliente cliente) {
        ArrayList<Arriendo> listaArriendosCliente = new ArrayList<Arriendo>();
        for (int i = 0; i < listaArriendos.size(); i++) {
            if (listaArriendos.get(i).getCliente().equals(cliente)) {
                listaArriendosCliente.add(listaArriendos.get(i));
            }
        }
        return listaArriendosCliente;
    }

    @Override
    public String toString() {
        return "Arriendo{" + "fecArr=" + fecArr + ", diasArriendo=" + diasArriendo
                + '}';
    }

}
