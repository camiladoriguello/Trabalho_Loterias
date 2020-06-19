package br.edu.univas.controller;

import java.util.Scanner;

import br.edu.univas.view.MenuView;

public class MainController {

	private Scanner scanner;
	private MenuView menuView;

	public MainController() { //atributos necessários para classe
		this.scanner = new Scanner(System.in);
		this.menuView = new MenuView();
	}

	public void initialize() {
		do {
			menuView.showMainMenu(); //mostra o menu principal do sistema 
			int mainOption = readIntOption(); // variável de opção

			if (mainOption == 1) {
				//TODO: implementar código que chama métodos da megasena
			} else if (mainOption == 2) {
				//TODO: implementar código que chama métodos da quina
			} else if (mainOption == 4) {
				//TODO: implementar código que chama métodos da lotofacil
			} else if (mainOption == 9) {
				menuView.showFarewell(); //finalização do sistema 
				break;
			} else {
				menuView.showInvalidOption(); //opção digitada invalida
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
