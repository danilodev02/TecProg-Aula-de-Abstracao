package br.edu.fatecpg.tecprog.abstracao.model;

public class RedeSocial {
	public String nmRede;
	public int idRedeSocial;
	public int qtUsuarios;
	public String algoritmo;
	public String tipoConteudo;

	public void atualizarAlgoritmo() {
		System.out.println(" Atualização de Algoritmo" + "\nRede Social: " + this.nmRede + "\nAlgoritmo anterior: "
				+ this.algoritmo + "\nAlgoritmo atualizado com sucesso!");
	}

	public void enviarMensagem() {
		System.out.println("Nova Mensagem\nRede: " + this.nmRede + "\nTipo de conteúdo: " + this.tipoConteudo
				+ "\nMensagem enviada com sucesso!");
	}

	public void criarPerfil() {
		System.out.println("Criação de Perfil" + "\nRede Social: " + this.nmRede + "\nID da Rede: " + this.idRedeSocial
				+ "\nTotal de usuários: " + this.qtUsuarios + "\nPerfil criado com sucesso!");
	}

}
