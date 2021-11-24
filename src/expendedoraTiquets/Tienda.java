package expendedoraTiquets;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
	private String nombre;
	private List<Cliente> clientes;
	
	public String getNombre() {
		return nombre;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public Tienda(String nombre) {
		super();
		this.nombre = nombre;
		this.clientes = new ArrayList<Cliente>();
	}
	
	public void nuevoCliente(Cliente cliente) {
		getClientes().add(cliente);
	}

	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + ", clientes=" + clientes + "]";
	}
	
}
