package br.edu.univas.controller;

import java.util.Scanner;

import br.edu.univas.view.MenuView;

public class MainController {

	private Scanner scanner;
	private MenuView menuView;

	public MainController() { //atributos necess�rios para classe
		this.scanner = new Scanner(System.in);
		this.menuView = new MenuView();
	}

	public void initialize() {
		do {
			menuView.showMainMenu(); //mostra o menu principal do sistema 
			int mainOption = readIntOption(); // vari�vel de op��o

			if (mainOption == 1) {
				//TODO: implementar c�digo que chama m�todos da megasena
			} else if (mainOption == 2) {
				//TODO: implementar c�digo que chama m�todos da quina
			} else if (mainOption == 4) {
				//TODO: implementar c�digo que chama m�todos da lotofacil
			} else if (mainOption == 9) {
				menuView.showFarewell(); //finaliza��o do sistema 
				break;
			} else {
				menuView.showInvalidOption(); //op��o digitada invalida
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
