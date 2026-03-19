package br.edu.fatecpg.tecprog.abstracao.model;

public class Jogo {
	public String nomeJogo;
	public String descricaoJogo;
	public String generoJogo;
	public String objetivoJogo;
	public String regrasJogo;
	
	public void iniciarJogo() {
		System.out.print("Bem vindo ao " + this.nomeJogo + 
						 ", um jogo de " + this.generoJogo + 
						 ".\nSeu objetivo é: " + this.objetivoJogo);
	}
	
	public void executarMecanicas() {
		System.out.print(this.descricaoJogo);
		System.out.print(this.regrasJogo);
		System.out.print("\nAçoẽs do Player: \n - Pulando, \n - Agachando, \n - Andando");
	}
	
	public void finalizarJogo() {
		System.out.print("Jogo finalizado\n\n");
	}
}
