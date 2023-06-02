package Hamburguesas_modulo;

@SuppressWarnings("serial")
public class ProductoRepetidoExeption extends HambueguesaExeption{
    private String repetido;

    public ProductoRepetidoExeption(String repetido) {
        super("Error: Producto repetido - " + repetido);
        this.repetido = repetido;
    }

    public String getProductoRepetido() {
        return repetido;
    }
}