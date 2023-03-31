package Ej1;

public class ProductoCongeladoPorAgua extends ProductoCongelado {

    private boolean esAguaDestilada;

    public ProductoCongeladoPorAgua(String fecha, int numeroLote, int temperaturaCongelacion, boolean esAguaDestilada) {
        super(fecha, numeroLote, temperaturaCongelacion);
        this.esAguaDestilada = esAguaDestilada;
    }

    public boolean isEsAguaDestilada() {
        return esAguaDestilada;
    }

    public void setEsAguaDestilada(boolean esAguaDestilada) {
        this.esAguaDestilada = esAguaDestilada;
    }
}
