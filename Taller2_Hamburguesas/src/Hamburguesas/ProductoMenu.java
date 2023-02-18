package Hamburguesas;

public class ProductoMenu implements Producto{

	public String nombre;
	
	public int precioBase;

	public ProductoMenu(String nombre, int precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
	}

	@Override
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public int getPrecio() {
		return precioBase;
	}

	@Override
	public String getTextoFactura() {
		return null;
	}
	
}
