package br.edu.fatecpg.tecprog.abstracao.model;

import java.time.LocalTime;

public class Curso {
	public String nmCurso;
	public int idCurso;
	public String nmProfessor;
	public LocalTime hrCurso;
	public String materiaCurso;
	

	public void acessarCurso() {
		System.out.println("Acessando o curso de " + this.nmCurso + "...\n\nAcesso concluido\nBem Vindo ao Curso de "+this.nmCurso);
	}

	public void lecionarCurso() {
		System.out.println("Bem vindo, professor: " + this.nmProfessor + "\nhorario da aula: " + this.hrCurso
				+ "\nmateria: " + this.materiaCurso);
	}

	public void atualizarCurso() {
		System.out.println("Atualizaçao do Curso de " + this.nmCurso + "\nID do curso: " + this.idCurso
				+ "\nNome do professor responsavel: " + this.nmProfessor + "\nMateria: " + this.materiaCurso
				+ "\nHorario: " + this.hrCurso);
	}
}
