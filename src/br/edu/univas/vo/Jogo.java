package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.Scanner;

public interface Jogo {
	
	public void executeSubMenu() throws Exception;
	
	public int[] getCincoMais();
	
	public int[] getCincoMenos();
	
	public ArrayList<Integer> geraRandomicos();
	
	public void verificaJogo(Scanner scanner);

}
