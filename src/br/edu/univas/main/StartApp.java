package br.edu.univas.main;

import br.edu.univas.controller.MainController;

public class StartApp {

	public static void main(String [] args) {
		MainController controller = new MainController(); //chama o controlador de a��es do usu�rio
		controller.initialize(); //chama o m�todo initialize
	}
}
