package Ej1;

public class ProductoCongelado extends Producto {

    private int temperaturaCongelacion;

    public ProductoCongelado(String fecha, int numeroLote, int temperaturaCongelacion) {
        super(fecha, numeroLote);
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    public int getTemperaturaCongelacion() {
        return temperaturaCongelacion;
    }

    public void setTemperaturaCongelacion(int temperaturaCongelacion) {
        this.temperaturaCongelacion = temperaturaCongelacion;
    }
}
