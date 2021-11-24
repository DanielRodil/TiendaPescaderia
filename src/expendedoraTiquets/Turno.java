package expendedoraTiquets;

public class Turno {
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Turno(int valor) {
		super();
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Turno [valor=" + valor + "]";
	}
	
}
