package br.edu.univas.factory;

import br.edu.univas.vo.Jogo;
import br.edu.univas.vo.Mega;
import br.edu.univas.vo.Lotofacil;
import br.edu.univas.vo.Quina;

public class JogoFactory {

	public static Jogo getJogo(int opcao) {
		if (opcao == 1) {
			return new Mega();
		}else if (opcao == 2) {
			return new Quina();
		}else if (opcao == 3) {
			return new Lotofacil(); 
		}
		return null;
	}
	
}
