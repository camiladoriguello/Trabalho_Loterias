package br.edu.univas.vo;

public class Quina extends Jogo {

	private int[] numerosSorteados = new int[5];

	public int[] getNumerosSorteados() {
		return numerosSorteados;
	}

	public void setNumerosSorteados(int[] numerosSorteados) {
		this.numerosSorteados = numerosSorteados;
	}
}
