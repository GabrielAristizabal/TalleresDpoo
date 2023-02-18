package Hamburguesas;

import java.util.ArrayList;

public class Combo implements Producto{

	public double descuento;
	
	public String nombreCombo;

	private ArrayList<ProductoMenu> itemsCombo;
	
	public Combo(String nombre, double descuento, ArrayList<ProductoMenu> itemsCombo) {
		this.nombreCombo = nombre;
		this.descuento = descuento;
		this.itemsCombo = itemsCombo;
	}
	
	public void agregarItemACombo(ProductoMenu itemCombo) {
		itemsCombo.add(itemCombo);
	}
	
	@Override
	public String getNombre() {
		return nombreCombo;
	}
	
	@Override
	public int getPrecio() {
		int precio = 0;
		for (ProductoMenu item:itemsCombo) {
			int iteracion = item.getPrecio();
			precio = precio + iteracion;
		}
		precio = (int) (precio - (precio*descuento));
		return precio;
	}
	
	@Override
	public String getTextoFactura() {
		return null;
	}
	
}
