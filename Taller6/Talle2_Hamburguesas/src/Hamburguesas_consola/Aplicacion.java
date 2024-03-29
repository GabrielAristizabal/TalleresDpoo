package Hamburguesas_consola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Hamburguesas_modulo.Pedido;
import Hamburguesas_modulo.Producto;
import Hamburguesas_modulo.Restaurante;

public class Aplicacion {

	public Restaurante restaurante;
	
	public Aplicacion(String ingr, String menu, String comb, String bebi) throws IOException {
		this.restaurante = new Restaurante();
		this.restaurante.cargarInformacionRestaurante(ingr, menu, comb, bebi);
	}
	
	public void ejecutarOpcion(Restaurante restaurante) throws IOException {
		System.out.println("Bienvenido a Restaurante\n");

		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
				if (opcion_seleccionada == 1)
					iniciarNuevoPedido();
				else if (opcion_seleccionada == 2)
					agregarElementoPedido();
				else if (opcion_seleccionada == 3)
					cerrarPedidoyyFacturar();
				else if (opcion_seleccionada == 4)
					consultarInformacionID();
				else if (opcion_seleccionada == 5) {
					System.out.println("Saliendo de la aplicación ...");
					continuar = false;
				}
				else
				{
					System.out.println("Por favor seleccione una opción válida.");
				}
			}
			catch (NumberFormatException e) {
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
	}
	
	public void mostrarMenu() {
		System.out.println("\nOpciones de la aplicación\n");
		System.out.println("1. Iniciar un nuevo pedido");
		System.out.println("2. Agregar un elemento a un pedido");
		System.out.println("3. Cerrar un pedido y guardar la factura");
		System.out.println("4. Consultar la información de un pedido dado su id");
		System.out.println("5. Salir");
	}
	
	private void iniciarNuevoPedido() {
		System.out.println("\n" + "Llena la siguiente informacion para crear su nuevo pedido" + "\n");
		String nombreCliente = input("Por favor ingrese su nombre");
		String direccionCliente = input("Por favor ingrese su direccion");
		this.restaurante.iniciarPedido(nombreCliente, direccionCliente);
		Pedido pedido = this.restaurante.getPedidoenCurso();
		int id = pedido.getIdPedido();
		System.out.println("\n" + "Su pedido se a creado correctamente y su numero de pedido es: " +id+ "\n");
	}
	
	private void agregarElementoPedido(){
			menum();
			int opcion_seleccionada = Integer.parseInt(input("\n" + "Elija el producto que quiere agregar a su pedido"));
				if (opcion_seleccionada == 1)
					this.restaurante.agregarProducto("corral");
				else if (opcion_seleccionada == 2)
					this.restaurante.agregarProducto("corral queso");
				else if (opcion_seleccionada == 3)
					this.restaurante.agregarProducto("corral pollo");
				else if (opcion_seleccionada == 4)
					this.restaurante.agregarProducto("corralita");
				else if (opcion_seleccionada == 5)
					this.restaurante.agregarProducto("todoterreno");
				else if (opcion_seleccionada == 6)
					this.restaurante.agregarProducto("1/2 libra");
				else if (opcion_seleccionada == 7)
					this.restaurante.agregarProducto("especial");
				else if (opcion_seleccionada == 8)
					this.restaurante.agregarProducto("casera");
				else if (opcion_seleccionada == 9)
					this.restaurante.agregarProducto("mexicana");
				else if (opcion_seleccionada == 10)
					this.restaurante.agregarProducto("criolla");
				else if (opcion_seleccionada == 11)
					this.restaurante.agregarProducto("costeña");
				else if (opcion_seleccionada == 12)
					this.restaurante.agregarProducto("hawaiana");
				else if (opcion_seleccionada == 13)
					this.restaurante.agregarProducto("wrap de pollo");
				else if (opcion_seleccionada == 14)
					this.restaurante.agregarProducto("wrap de lomo");
				else if (opcion_seleccionada == 15)
					this.restaurante.agregarProducto("ensalada mexicana");
				else if (opcion_seleccionada == 16)
					this.restaurante.agregarProducto("papas medianas");
				else if (opcion_seleccionada == 17)
					this.restaurante.agregarProducto("papas grandes");
				else if (opcion_seleccionada == 18)
					this.restaurante.agregarProducto("papas en casco medianas");
				else if (opcion_seleccionada == 19)
					this.restaurante.agregarProducto("papas en casco grandes");
				else if (opcion_seleccionada == 20)
					this.restaurante.agregarProducto("agua cristal sin gas");
				else if (opcion_seleccionada == 21)
					this.restaurante.agregarProducto("agua cristal con gas");
				else if (opcion_seleccionada == 22)
					this.restaurante.agregarProducto("gaseosa");
				else if (opcion_seleccionada == 23)
					this.restaurante.agregarProductoC(0);
				else if (opcion_seleccionada == 24)
					this.restaurante.agregarProductoC(1);
				else if (opcion_seleccionada == 25)
					this.restaurante.agregarProductoC(2);
				else if (opcion_seleccionada == 26)
					this.restaurante.agregarProductoC(3);
				else
				{
					System.out.println("Por favor seleccione una opción válida.");
				}
			}
	
	public void menum() {
		System.out.println("\nMenu\n");
		System.out.println("1. corral");
		System.out.println("2. corral queso");
		System.out.println("3. corral Pollo");
		System.out.println("4. corralita");
		System.out.println("5. todoterreno");
		System.out.println("6. 1/2 libra");
		System.out.println("7. especial");
		System.out.println("8. casera");
		System.out.println("9. mexicana");
		System.out.println("10. criolla");
		System.out.println("11. costeña");
		System.out.println("12. hawaiana");
		System.out.println("13. wrap de pollo");
		System.out.println("14. wrap de lomo");
		System.out.println("15. ensalada mexicana");
		System.out.println("16. papas medianas");
		System.out.println("17. papas grandes");
		System.out.println("18. papas en casco medianas");
		System.out.println("19. papas en casco grandes");
		System.out.println("20. agua cristal sin gas");
		System.out.println("21. agua cristal con gas");
		System.out.println("22. gaseosa");
		System.out.println("23. combo corral");
		System.out.println("24. combo corral queso");
		System.out.println("25. combo todoterreno");
		System.out.println("26. combo especial");
	}
	
	public void cerrarPedidoyyFacturar() throws IOException {
		this.restaurante.cerraryGuardadPedido();		
	}
	
	public void consultarInformacionID(){
		int id = Integer.parseInt(input("Por favor ingrese el ID del pedido"));
		ArrayList<String> lista = new ArrayList<String>();
		Pedido pedido = this.restaurante.getPedidos().get(id);
		String nombre = pedido.getNombreCliente();
		String direccion = pedido.getDireccionCliente();
		int numero = pedido.getNumeroPedido();
		for (Producto item:pedido.getItemsPedido()) {
			String n = item.getNombre();
			lista.add(n);
		}
		int precio = pedido.getPrecioTotalPedido();
		System.out.println("La informacion del peido con ID "+id+" es:"+"\n");
		System.out.println("Nombre:"+nombre+"\n"+"Direccion:"+direccion+"\n"+"Productos:"+lista+"\n"+"Numero de pedido:"+numero+"\n"+"Precio:"+precio);
	}
	
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) throws IOException
	{
		String ingr = "./data/ingredientes.txt";
		String menu = "./data/menu.txt";
		String comb = "./data/combos.txt";
		String bebi = "./data/bebidas.txt";
		Aplicacion consola = new Aplicacion(ingr, menu, comb, bebi);
		consola.ejecutarOpcion(consola.restaurante);
	}
}
		