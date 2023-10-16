package registroPessoas;

public class ColecaoPessoa implements Colecao {
	Pessoa [] dados = new Pessoa[100];
	int posicaoCorrente = 0;
	
	public boolean inserir(Pessoa p) {
		if(posicaoCorrente < 100) {
			dados[posicaoCorrente] = p;
			posicaoCorrente++;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean remover() {
		if(posicaoCorrente>=0) {
			dados[posicaoCorrente] = null;
			posicaoCorrente--;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean remover(int indice) {
		if(indice >= 0 && indice <=posicaoCorrente) {
			for(int i = indice; i < posicaoCorrente; i++) {
				dados[i] = dados[i+1];
			}
			posicaoCorrente--;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean atualizar(int indice, Pessoa p) {
		if(indice >=0 && indice <=posicaoCorrente) {
			dados[indice] = p;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean pesquisar(Pessoa p) {
		boolean isTrue = false;
		for(int i = 0; i < posicaoCorrente; i++) {
			if(dados[i] == p) {
				isTrue = true;
			}
		}
		return isTrue;
	}
	
	public boolean colecaoEstaVazia() {
		return posicaoCorrente == 0;
	}
	
	public void imprimirDadosColecao() {
		for(int i = 0; i<posicaoCorrente; i++) {
			System.out.println(dados[i].toString());
		}
	}
	
	public Pessoa retornarObjeto(int indice) {
		return dados[indice];
	}
}