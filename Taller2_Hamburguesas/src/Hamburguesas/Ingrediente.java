package Hamburguesas;

public class Ingrediente {

	public String nombre;
	
	public int costoAdicional;

	public Ingrediente(String nombre, int costoAdicional) {
		this.nombre = nombre;
		this.costoAdicional = costoAdicional;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getCostoAdicional() {
		return costoAdicional;
	}

}
