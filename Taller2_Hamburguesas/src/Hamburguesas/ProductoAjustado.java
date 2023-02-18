package Hamburguesas;

import java.util.ArrayList;

public class ProductoAjustado implements Producto{

	private ProductoMenu base;

	private ArrayList<Ingrediente> agregados;

	private ArrayList<Ingrediente> eliminados;

	public ProductoAjustado(ProductoMenu base) {
		this.base = base;
		this.agregados = new ArrayList <Ingrediente>();
		this.eliminados = new ArrayList <Ingrediente>();
	}
	
	@Override
	public String getNombre() {
		return base.getNombre();
	}
	
	@Override
	public int getPrecio() {
		return base.getPrecio();
	}

	@Override
	public String getTextoFactura() {
		return null;
	}
	
}
