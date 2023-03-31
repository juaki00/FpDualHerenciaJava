package Ej1;

public class ProductoCongeladoPorAire extends ProductoCongelado{

    private int tipoAire;

    public ProductoCongeladoPorAire(String fecha, int numeroLote, int temperaturaCongelacion, int tipoAire) {
        super(fecha, numeroLote, temperaturaCongelacion);
        this.tipoAire = tipoAire;
    }

    public int getTipoAire() {
        return tipoAire;
    }

    public void setTipoAire(int tipoAire) {
        this.tipoAire = tipoAire;
    }
}
