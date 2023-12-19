package Logica;

public class CuotaArriendo {
    private int numCuota;
    private double valorCuota;
    private Boolean pagada;

    public CuotaArriendo(int numCuota, double valorCuota, Boolean pagada) {
        this.numCuota = numCuota;
        this.valorCuota = valorCuota;
        this.pagada = pagada;
    }

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public double getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(int valorCuota) {
        this.valorCuota = valorCuota;
    }

    public Boolean getPagada() {
        return pagada;
    }

    public void setPagada(Boolean pagada) {
        this.pagada = pagada;
    }
}
