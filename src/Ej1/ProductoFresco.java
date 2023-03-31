package Ej1;

public class ProductoFresco extends Producto{
    private String tipoProducto;

    public ProductoFresco(String fechaCaducidad, int numeroLote, String tipoProducto) {
        super(fechaCaducidad, numeroLote);
        this.tipoProducto = tipoProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
}
