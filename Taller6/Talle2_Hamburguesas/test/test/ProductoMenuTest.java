package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import Hamburguesas_modulo.Combo;
import Hamburguesas_modulo.ProductoMenu;
import Hamburguesas_modulo.Restaurante;

public class ProductoMenuTest {
	
	private Restaurante restaurante;
	private ProductoMenu producto;
	
	@BeforeEach
	public void setUp() {
		ProductoMenu producto = new ProductoMenu("corral",14000,546);
	}
	
	@Test
	@Order(1)
	@DisplayName("getNombre")
	public void testGetNombre() {
		String nombre = "corral";
		String prueba = producto.getNombre();
		assertTrue(nombre == prueba, () -> "Se da el nombre");
	}

	@Test
	@Order(2)
	@DisplayName("getPrecio")
	public void testGetPrecio() {
		int precio = 14000;
		int prueba = producto.getPrecio();
		assertTrue(precio == prueba, () -> "Se da el precio");
	}
	
	@Test
	@Order(3)
	@DisplayName("getCaloria")
	public void testGetCaloria() {
		int precio = 546;
		int prueba = producto.getCaloria();
		assertTrue(precio == prueba, () -> "Se da las calorias");
	}
}
