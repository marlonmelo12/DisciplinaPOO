package registroPessoas;

public interface Colecao {
	boolean inserir(Pessoa p);
	boolean remover();
	boolean remover(int indice);
	boolean atualizar(int indice, Pessoa p);
	boolean pesquisar(Pessoa p);
	boolean colecaoEstaVazia();
	void imprimirDadosColecao();
	Pessoa retornarObjeto(int indice);
}
