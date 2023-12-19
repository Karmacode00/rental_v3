/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Logica.ArriendoCuota;
import Logica.Cliente;
import Logica.Vehiculo;
import Presentacion.IngresoCliente;
import Presentacion.IngresoVehiculo;
import Presentacion.InicioArriendoCuota;
import java.util.ArrayList;

import javax.swing.JComboBox;

/**
 *
 * @author
 */
public class AdministradorArrays {

    ArrayList<Cliente> clientes;
    ArrayList<Vehiculo> vehiculos;
    ArrayList<ArriendoCuota> arriendoCuotas;

    public AdministradorArrays() {

    }

    public void crearArrayList() {
        clientes = new ArrayList<Cliente>();
        vehiculos = new ArrayList<Vehiculo>();
        arriendoCuotas = new ArrayList<ArriendoCuota>();
    }

    public void insertarCliente(Cliente cliente) {
        clientes.add(cliente);

    }

    public String retornaInformacionCliente() {

        String informacion = "";
        for (int contador = 0; contador < clientes.size(); contador++) {
            informacion += clientes.get(contador).toString() + "\n";
        }
        return informacion;

    }

    public Boolean validarClienteExistente(ArrayList<Cliente> clientes, String cedula) {
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equalsIgnoreCase(cedula)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Vehiculo> llenarCboVehiculos() {
        ArrayList<Vehiculo> vehiculos = Vehiculo.getVehiculos();

        for (int i = 0; i < vehiculos.size(); i++) {
            InicioArriendoCuota.cboSeleccionAutomovil.addItem(vehiculos.get(i).getPatente());
        }
        return vehiculos;
    }

    public void limpiarCboClientes() {
        InicioArriendoCuota.cboClientes.removeAllItems();
    }

    public ArrayList<Cliente> llenarCboClientes(JComboBox<String> cboClientes) {
        ArrayList<Cliente> clientes = Cliente.getClientes();

        for (int i = 0; i < clientes.size(); i++) {
            cboClientes.addItem(clientes.get(i).getNombre());
        }
        return clientes;
    }

    public void insertarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);

    }

    public String retornaInformacionVehiculo() {

        String informacion = "";
        for (int contador = 0; contador < vehiculos.size(); contador++) {
            informacion += vehiculos.get(contador).toString() + "\n";
        }
        return informacion;

    }

    public void insertarArriendocuota(ArriendoCuota arriendoCuota) {
        arriendoCuotas.add(arriendoCuota);

    }

}
