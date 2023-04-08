package mundo;

public class Perro {
	
	private String nombre;
	private String raza;
	private int edad;
	private int puntos;
	private String imagen;
	
	public Perro(String nombre, String raza, int edad, int puntos, String imagen) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.puntos = puntos;
		this.imagen = imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public String getRaza() {
		return raza;
	}

	public int getEdad() {
		return edad;
	}

	public int getPuntos() {
		return puntos;
	}

	public String getImagen() {
		return imagen;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	

}
