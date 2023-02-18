package Hamburguesas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.io.*;

public class Restaurante {

	private ArrayList<Combo> combos;
	
	private HashMap<Integer, Pedido> pedidos;
	
	private ArrayList<Ingrediente> ingredientes;
	
	private HashMap<String,ProductoMenu> menuBase;

	private Pedido pedidoenCurso;
	
	private int idActual;
	
	public Restaurante() {
		this.menuBase = new HashMap <String,ProductoMenu>();
		this.pedidos = new HashMap <Integer,Pedido>();
		this.ingredientes = new ArrayList <Ingrediente>();
		this.combos = new ArrayList <Combo>();
	}
	
	public void iniciarPedido(String nombreCliente, String direccionCliente) {
		idActual += 1;
		Pedido pedido = new Pedido(nombreCliente, direccionCliente, idActual);
		this.setPedidoenCurso(pedido);
		pedidos.put(idActual, pedido);
	}
	
	public void cerraryGuardadPedido() throws IOException {
		int id = pedidoenCurso.getIdPedido();
		this.pedidos.put(id,pedidoenCurso);
		File archivo = new File("./data/Factura"+id+".txt");
		this.pedidoenCurso.generarFactura(archivo);
	}

	public Pedido getPedidoenCurso() {
		return pedidoenCurso;
	}
	
	public ArrayList<ProductoMenu> getMenuBase() {
		ArrayList<ProductoMenu> menu = new ArrayList <ProductoMenu>();
		for (ProductoMenu producto : menuBase.values()) {
			menu.add(producto);
		}
		return menu;
			
	}
	
	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	
	public int getIdActual() {
		return idActual;
	}

	public HashMap<Integer, Pedido> getPedidos() {
		return pedidos;
	}
	
	public void setCombos(ArrayList<Combo> combos) {
		this.combos = combos;
	}

	public void setPedidos(HashMap<Integer, Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public void setMenuBase(HashMap<String, ProductoMenu> menuBase) {
		this.menuBase = menuBase;
	}

	public void setPedidoenCurso(Pedido pedidoenCurso) {
		this.pedidoenCurso = pedidoenCurso;
	}

	public void setIdActual(int idActual) {
		this.idActual = idActual;
	}
	
	public ArrayList<Combo> getCombos() {
		return combos;
	}
	
	public void agregarProducto(String item) {
		ProductoMenu itemp = menuBase.get(item);
		this.pedidoenCurso.agregarProducto(itemp);
	}
		
	public void agregarProductoC(int item) {
		Combo combop = combos.get(item);
		this.pedidoenCurso.agregarProducto(combop);
	}
	
	public void cargarInformacionRestaurante(String archivoIngredientes, String archivoMenu, String archivoCombos) throws IOException {
		menuBase = new HashMap <String,ProductoMenu>();
		ingredientes = new ArrayList <Ingrediente>();
		combos = new ArrayList <Combo>();
		File archivoI = new File(archivoIngredientes);
		File archivoM = new File(archivoMenu);
		File archivoC = new File(archivoCombos);
		cargarIngredientes(archivoI);
		cargarMenu(archivoM);
		cargarCombos(archivoC);
	}
	
	public void cargarIngredientes(File archivoIngredientes) throws IOException {
		BufferedReader lector = new BufferedReader(new FileReader(archivoIngredientes));
		String linea = lector.readLine();
		while(linea!=null) {
				
			String [] datos = linea.split(";");
			String nombreI = datos[0];
			String precioA = datos[1];
			int precioN = Integer.parseInt(precioA);
			Ingrediente nuevo = new Ingrediente(nombreI, precioN);
			ingredientes.add(nuevo);
			linea = lector.readLine();
			}
			lector.close();
	
	}
	
	public void cargarMenu(File archivoMenu) throws IOException {
		BufferedReader lector = new BufferedReader(new FileReader(archivoMenu));
		String linea = lector.readLine();
		while(linea!=null) {
			
			String [] datos = linea.split(";");
			String nombreI = datos[0];
			String precio = datos[1];
			int precioN = Integer.parseInt(precio);			
			ProductoMenu nuevo = new ProductoMenu(nombreI, precioN);
			menuBase.put(nombreI,nuevo);
			linea = lector.readLine();
		}
		lector.close();
	}
		
	public void cargarCombos(File archivoCombos) throws IOException {
		BufferedReader lector = new BufferedReader(new FileReader(archivoCombos));
		String linea = lector.readLine();
		while(linea!=null) {
			
			String [] datos = linea.split(";");
			String nombreI = datos[0];
			String descuento = datos[1];
			String item1 = datos[2];
			String item2 = datos[3];
			String item3 = datos[4];
			ArrayList<ProductoMenu> items = new ArrayList<ProductoMenu>();
			descuento = descuento.replace("%", "");
			double descuentod = Double.valueOf(descuento);
			descuentod = descuentod/100;
			items.add(menuBase.get(item1));
			items.add(menuBase.get(item2));
			items.add(menuBase.get(item3));
			Combo nuevo = new Combo(nombreI, descuentod, items);
			combos.add(nuevo);
			linea = lector.readLine();
		}
		lector.close();
	}
	
}
