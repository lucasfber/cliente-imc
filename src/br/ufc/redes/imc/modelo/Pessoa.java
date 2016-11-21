package br.ufc.redes.imc.modelo;

import java.io.Serializable;

public class Pessoa implements Serializable{
	
    private static final long serialVersionUID = 1L;
	private double peso;
	private double altura;
	
	public Pessoa(double peso, double altura){
		this.peso = peso;
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
