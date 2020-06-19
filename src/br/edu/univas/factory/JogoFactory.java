package br.edu.univas.factory;

import br.edu.univas.vo.Jogo;

public class JogoFactory {

	public static Jogo getJogo(int opcao) {
		if (opcao == 1) {
			//TODO: return new Mega();
		}else if (opcao == 2) {
			//TODO: return new Quina();
		}else if (opcao == 3) {
			//TODO: return new Lotofacil(); 
		}
		return null;
	}
	
}
