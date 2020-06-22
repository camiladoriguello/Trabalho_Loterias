package br.edu.univas.vo;

import br.edu.univas.view.MenuView;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lotofacil implements Jogo {

	Scanner scanner = new Scanner(System.in);
	Random generator = new Random();
	MenuView menuView = new MenuView();
	private int menuOption;
	
	private int id;
	private String data;
	private int[] numerosSorteados = new int[15];
	
	@Override
	public void executeSubMenu() throws Exception {
		menuView.showSubMenu();
		menuOption = readIntOption();
		
		if(menuOption == 1) {
			getCincoMais();
		}else if (menuOption == 2) {
			getCincoMenos();
		}else if (menuOption == 3) {
			System.out.println("Os números da Surpresinha foram: " + geraRandomicos());
		}else if (menuOption == 4) {
			verificaJogo(scanner);
		}else {
			menuView.showInvalidOption();
		}
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int[] getNumerosSorteados() {
		return numerosSorteados;
	}
	public void setNumerosSorteados(int[] numerosSorteados) {
		this.numerosSorteados = numerosSorteados;
	}

	@Override
	public int[] getCincoMais() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] getCincoMenos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Integer> geraRandomicos() {
		ArrayList<Integer> jogoRandomLotofacil = new ArrayList<Integer>();
		for (int i = 0; i < 15; i++) {
			jogoRandomLotofacil.add(generator.nextInt(25) + 1);
		}
		Collections.sort(jogoRandomLotofacil); //ordena
		return jogoRandomLotofacil;
	}

	@Override
	public void verificaJogo(Scanner scanner) {
		int[] meuJogo = new int[6];
		
		System.out.println("Digite seu jogo!");
		for(int i = 0; i < 15; i++) {
			System.out.print("N" + (i + 1) + ": ");
			meuJogo[i] = readIntOption();
		}
		System.out.println("Seu jogo foi: ");
		for(int i = 0; i < 15; i++) {
			System.out.print(meuJogo[i] + " ");
		}
		System.out.println();
	}
	
	private int readIntOption() {
		int option = scanner.nextInt();
		scanner.nextLine();
		return option;
	}
}
