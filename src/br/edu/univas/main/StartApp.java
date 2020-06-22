package br.edu.univas.main;

import br.edu.univas.controller.MainController;

public class StartApp {

	public static void main(String [] args) {
		MainController controller = new MainController(); // ----chama o controlador de ações do usuário
		try {
			controller.initialize();
		} catch (Exception e) {
			System.out.println("Ops! Houve um erro! Reinicie o sistema!");
			e.printStackTrace();
		} 
	}
}
