package Ej1;

public class ProductoCongeladoPorNitrogeno extends ProductoCongelado{

    private int numeroSeguridad;

    public ProductoCongeladoPorNitrogeno(String fecha, int numeroLote, int temperaturaCongelacion, int numeroSeguridad) {
        super(fecha, numeroLote, temperaturaCongelacion);
        this.numeroSeguridad = numeroSeguridad;
    }

    public int getNumeroSeguridad() {
        return numeroSeguridad;
    }

    public void setNumeroSeguridad(int numeroSeguridad) {
        this.numeroSeguridad = numeroSeguridad;
    }

}
