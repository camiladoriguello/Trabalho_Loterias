package br.edu.univas.view;

public class MenuView {

	public void showMainMenu() {
		System.out.println("\nOP��ES DE JOGO\n");
		System.out.println("1 - Mega-Sena");
		System.out.println("2 - Quina");
		System.out.println("3 - Lotof�cil");
		System.out.println("9 - Sair");
	}
	
	public void showSubMenu() {
		System.out.println("1 - 5 n�meros que mais sa�ram");
		System.out.println("2 - 5 n�meros que menos sa�ram");
		System.out.println("3 - Gerar n�meros rand�micos");
		System.out.println("4 - Verificar meu jogo");
	}
	
	public void showFarewell() {
		System.out.println("\nObrigado por utilizar nosso sistema!");
		System.out.println("Volte sempre!");
	}

	public void showInvalidOption() {
		System.out.println("\nOp��o inv�lida!");
		System.out.println("Por favor, digite uma op��o correta!");
	}
	
	public void showUserNotLogged() {
		System.out.println("\nPara essa opera��o, voc� precisa estar logado!\n");
	}
}
