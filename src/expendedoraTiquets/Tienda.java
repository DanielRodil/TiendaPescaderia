package expendedoraTiquets;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
	private String nombre;
	private List<Cliente> clientes;
	private Turno turno;
	
	public String getNombre() {
		return nombre;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public Turno getTurno() {
		return turno;
	}
	
	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public Tienda(String nombre) {
		this.nombre = nombre;
		this.clientes = new ArrayList<Cliente>();
		this.turno = new Turno();
	}
	
	public void nuevoCliente(Cliente cliente) {
		getClientes().add(cliente);
	}
	
	public void siguienteTurno(Cliente cliente) {
		int siguienteTurno = getTurno().getValor() + 1;
		turno.setValor(siguienteTurno);
		Turno turno = new Turno(siguienteTurno);		
		cliente.setTurno(turno);
	}
		
	@Override
	public String toString() {
		return "" + nombre + clientes;
	}
	
	
}
