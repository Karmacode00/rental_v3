package Logica;

import java.util.ArrayList;

public class Cliente {
    private String cedula;
    private String nombre;
    private Boolean vigente;
    private static ArrayList<Cliente> listaClientes;

    public Cliente(String cedula, String nombre, Boolean vigente) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.vigente = vigente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    public static Cliente getCliente(String nombre) {
        if (listaClientes == null)
            initClientes();
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getNombre().equals(nombre)) {
                return listaClientes.get(i);
            }
        }
        return null;
    }

    public static void initClientes() {

        listaClientes = new ArrayList<Cliente>();
        Cliente cliente1 = new Cliente("11.111.111-1", "Juan Perez", true);
        Cliente cliente2 = new Cliente("22.222.222-2", "Margarita Gomez", false);

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
    }

    public static ArrayList<Cliente> getClientes() {
        return listaClientes;
    }
}
