package Ej1;

public class ProductoRefrigerado extends Producto{

    private int temperaturaRefrigerado;

    public ProductoRefrigerado(String fechaCaducidad, int numeroLote, int temperaturaRefrigerado) {
        super(fechaCaducidad, numeroLote);
        this.temperaturaRefrigerado = temperaturaRefrigerado;
    }

    public int getTemperaturaRefrigerado() {
        return temperaturaRefrigerado;
    }

    public void setTemperaturaRefrigerado(int temperaturaRefrigerado) {
        this.temperaturaRefrigerado = temperaturaRefrigerado;
    }
}
