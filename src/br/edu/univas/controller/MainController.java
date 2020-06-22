package br.edu.univas.controller;

import java.util.Scanner;
import br.edu.univas.factory.JogoFactory;
import br.edu.univas.view.MenuView;
import br.edu.univas.reader.CsvReader;
import br.edu.univas.vo.*;

public class MainController {

	private Scanner scanner;
	private MenuView menuView;
	private CsvReader csvReader;

	public MainController() { // ----------------------------atributos necessários para classe
		this.scanner = new Scanner(System.in);
		this.menuView = new MenuView();
		this.csvReader = new CsvReader();
		
	}

	public void initialize() throws Exception {
		
		csvReader.readMegaCsv(); // -------------------------lê os tres arquivos CSV e os armazena na memória
		csvReader.readQuinaCsv();
		csvReader.readLotofacilCsv();
		
		do {
			menuView.showMainMenu(); // ---------------------mostra o menu principal do sistema 
			int mainOption = readIntOption(); // ------------leitura de variável de opção

			if (mainOption == 1) {
				Mega mega = (Mega) JogoFactory.getJogo(mainOption);
				mega.executeSubMenu();
			} else if (mainOption == 2) {
				Quina quina = (Quina) JogoFactory.getJogo(mainOption);
				quina.executeSubMenu();
			} else if (mainOption == 3) {
				Lotofacil lotofacil = (Lotofacil) JogoFactory.getJogo(mainOption);
				lotofacil.executeSubMenu();
			} else if (mainOption == 9) {
				menuView.showFarewell(); // -----------------mensagem de finalização do sistema 
				break;
			} else {
				menuView.showInvalidOption(); // ------------mensagem de opção digitada invalida
			}
		} while (true);

		scanner.close();
	}
	
	private int readIntOption() {
		int option = scanner.nextInt();
		scanner.nextLine();
		return option;
	}
}
