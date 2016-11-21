package br.ufc.redes.imc.modelo;

public class Resultado {

	private double valorIMC;
	private String situacao;
	
	public Resultado(double imc, String situacao) {
		this.valorIMC = imc;
		this.situacao = situacao;
	}

	public double getValorIMC() {
		return valorIMC;
	}

	public void setValorIMC(double valorIMC) {
		this.valorIMC = valorIMC;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
}
