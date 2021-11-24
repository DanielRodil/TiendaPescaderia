package app;

import expendedoraTiquets.Cliente;
import expendedoraTiquets.Tienda;

public class App {

	public static void main(String[] args) {
		
		Tienda pescaderia = new Tienda("Pescaderia");
		Cliente paco = new Cliente("Paco");
		Cliente maria = new Cliente("Maria");
		Cliente pedro = new Cliente("Pedro");
		Cliente amparo = new Cliente("Amparo");
		
		pescaderia.nuevoCliente(paco);
		pescaderia.nuevoCliente(maria);
		pescaderia.nuevoCliente(pedro);
		pescaderia.nuevoCliente(amparo);
		
		System.out.println(pescaderia);
		
		

	}

}
