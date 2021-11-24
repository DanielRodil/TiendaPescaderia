package expendedoraTiquets;

public class Cliente implements Comparable<Cliente>{
	private String nombre;
	private Turno turno;
	
	public String getNombre() {
		return nombre;
	}
	
	public Turno getTurno() {
		return turno;
	}
	
	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre + "(turno " + turno + ")";
	}

	@Override
	public int compareTo(Cliente cliente) {
		return Integer.valueOf(getTurno().getValor()).compareTo(cliente.getTurno().getValor());
	}

}
