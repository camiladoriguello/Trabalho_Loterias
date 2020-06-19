package br.edu.univas.main;

import br.edu.univas.controller.MainController;

public class StartApp {

	public static void main(String [] args) {
		MainController controller = new MainController(); //chama o controlador de ações do usuário
		controller.initialize(); //chama o método initialize
	}
}
