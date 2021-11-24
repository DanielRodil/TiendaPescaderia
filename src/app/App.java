package app;

import java.util.Collections;

import expendedoraTiquets.Cliente;
import expendedoraTiquets.Tienda;
import expendedoraTiquets.Turno;

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
				
		pescaderia.siguienteTurno(paco);
		System.out.println(pescaderia.getClientes().get(0));
		pescaderia.siguienteTurno(maria);
		System.out.println(pescaderia.getClientes().get(1));
		pescaderia.siguienteTurno(pedro);
		System.out.println(pescaderia.getClientes().get(2));
		pescaderia.siguienteTurno(amparo);
		System.out.println(pescaderia.getClientes().get(3));
		

		System.out.println(pescaderia);
		Collections.shuffle(pescaderia.getClientes());
		System.out.println(pescaderia);
		pescaderia.getClientes().sort(null);
		System.out.println(pescaderia);
		
	}

}
