package br.ufc.redes.imc;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.ufc.redes.imc.modelo.Pessoa;


public class ClienteIMC {

	public static void main(String[] args) {
		try {
			String ipServidor = JOptionPane.showInputDialog("QUAL O IP DO SERVIDOR AO QUAL DESEJA SE CONECTAR?");
			Socket cliente = new Socket(ipServidor, 5000);
			Scanner teclado = new Scanner(System.in);
			String clienteHost = cliente.getLocalAddress().getHostName();
			
			ObjectOutputStream oos = new ObjectOutputStream(cliente.getOutputStream());
			new Thread(new ClienteIMCListener(cliente)).start();
			
			System.out.println("OLÁ " + clienteHost + "\nDIGITE O SEU PESO (Ex: 70) E EM SEGUIDA A SUA ALTURA (Ex: 1,78)");
			while((teclado.hasNextLine())){
				double peso = teclado.nextDouble();
				double altura = teclado.nextDouble();
				
				Pessoa p = new Pessoa(peso,altura);
				oos.writeObject(p);
				oos.flush();
			}

			oos.close();
			teclado.close();
			cliente.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
