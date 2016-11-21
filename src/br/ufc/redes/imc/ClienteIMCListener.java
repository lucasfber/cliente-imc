package br.ufc.redes.imc;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClienteIMCListener implements Runnable{

	private Scanner leitor;
	private Socket	cliente;
	
	public ClienteIMCListener(Socket cliente) throws IOException {
		this.cliente = cliente;
		leitor = new Scanner(this.cliente.getInputStream());
	}

	@Override
	public void run() {
		while(leitor.hasNextLine()){
			System.out.println(leitor.nextLine());
		}
		
	}

}
