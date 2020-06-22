package br.edu.univas.vo;

import br.edu.univas.view.MenuView;
import br.edu.univas.reader.CsvReader;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Mega implements Jogo{
	ArrayList<Mega> comparacao = new ArrayList<Mega>();
	CsvReader csv = new CsvReader();
	Scanner scanner = new Scanner(System.in);
	Random generator = new Random();
	MenuView menuView = new MenuView();
	private int menuOption;
	
	private int id;
	private String data;
	private int[] numerosSorteados = new int[6];
	
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
		return null;
	}

	@Override
	public int[] getCincoMenos() {
		return null;
	}

	@Override
	public ArrayList<Integer> geraRandomicos() {
		ArrayList<Integer> jogoRandomMega = new ArrayList<Integer>();
		for (int i = 0; i < 6; i++) {
			jogoRandomMega.add(generator.nextInt(60) + 1); 
		}
		Collections.sort(jogoRandomMega); //ordena
		return jogoRandomMega;
	}

	@Override
	public void verificaJogo(Scanner scanner) {
		int[] meuJogo = new int[6];
		
		System.out.println("Digite seu jogo!");
		for(int i = 0; i < 6; i++) {
			System.out.print("N" + (i + 1) + ": ");
			meuJogo[i] = readIntOption();
		}
		System.out.println("Seu jogo foi: ");
		for(int i = 0; i < 6; i++) {
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
