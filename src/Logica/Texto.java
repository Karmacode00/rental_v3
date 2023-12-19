package Logica;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class Texto {
    
     public static void main(String[] args) throws IOException {
        File file = new File("baseClientes.txt");
    }

    public static void guardarClientes(File file, ArrayList<Cliente> lista) {
        try {
            FileOutputStream ficheroSalida = new FileOutputStream(file);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida);
            objetoSalida.writeObject(lista);
            objetoSalida.close();

        } catch (FileNotFoundException e) {
            System.out.println("El fichero no Existe");
        } catch (IOException e) {

            System.out.print(e.getMessage());

        }
    }

    public static ArrayList<Cliente> obtieneListaCliente(File file) throws ClassNotFoundException {
        ArrayList<Cliente> lista = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            lista = (ArrayList<Cliente>) ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no Existe");
        } catch (IOException e) {
            System.out.print(e.getMessage());

        }
        return lista;
        
    }     
}



