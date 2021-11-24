package expendedoraTiquets;

public class Cliente {
	private String nombre;
	private Turno turno;
	
	public String getNombre() {
		return nombre;
	}
	
	public Turno getTurno() {
		return turno;
	}

	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", turno=" + turno + "]";
	}

}
