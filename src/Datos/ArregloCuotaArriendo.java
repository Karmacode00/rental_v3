
package Datos;

import Logica.CuotaArriendo;
import java.util.ArrayList;

/**
 *
 * @author Manuel Cano
 */
public class ArregloCuotaArriendo {
    
    private ArrayList<CuotaArriendo>lista;

    public ArregloCuotaArriendo() {
        lista = new ArrayList<CuotaArriendo>();
    }
    public void agregar(CuotaArriendo ca){
        lista.add(ca);
        
    }
    
    public CuotaArriendo obtener(int posicion){
        return lista.get(posicion);
        
    }
    public int tamaño(){
        return lista.size();
        
    }
}
