package br.edu.univas.view;

public class MenuView {

	public void showMainMenu() {
		System.out.println("\nOPÇÕES DE JOGO\n");
		System.out.println("1 - Mega-Sena");
		System.out.println("2 - Quina");
		System.out.println("3 - Lotofácil");
		System.out.println("9 - Sair");
	}
	
	public void showSubMenu() {
		System.out.println("1 - 5 números que mais saíram");
		System.out.println("2 - 5 números que menos saíram");
		System.out.println("3 - Gerar números randômicos");
		System.out.println("4 - Verificar meu jogo");
	}
	
	public void showFarewell() {
		System.out.println("\nObrigado por utilizar nosso sistema!");
		System.out.println("Volte sempre!");
	}

	public void showInvalidOption() {
		System.out.println("\nOpção inválida!");
		System.out.println("Por favor, digite uma opção correta!");
	}
	
	public void showUserNotLogged() {
		System.out.println("\nPara essa operação, você precisa estar logado!\n");
	}
}
