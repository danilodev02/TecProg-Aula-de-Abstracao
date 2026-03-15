package br.edu.fatecpg.tecprog.abstracao.view;

import br.edu.fatecpg.tecprog.abstracao.model.*;
import java.util.*;
import java.time.*;

public class Main {

	public static void main(String[] args) {
		int op;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Escolha qual Classe deseja ver: " + "\n1.Produto" + "\n2.Curso" + "\n3.Rede Social");
			op = sc.nextInt();
		}

		switch (op) {
		case 1:
			Produto newProduto = new Produto();
			newProduto.nmProduto = "Notebook";
			newProduto.idProduto = 100;
			newProduto.qtEstoque = 50;
			newProduto.valorProduto = 2499.90;
			newProduto.categoriaProduto = "Eletrônicos";

			newProduto.consultarProduto();
			System.out.println("-".repeat(35));

			newProduto.venderProduto();
			System.out.println("-".repeat(35));

			newProduto.excluirProduto();
			break;

		case 2:
			Curso newCurso = new Curso();

			newCurso.nmCurso = "Desenvolvimento de Software e Multiplataforma";
			newCurso.idCurso = 200;
			newCurso.hrCurso = LocalTime.of(13, 10);
			newCurso.materiaCurso = "Tecnicas de Programação I";
			newCurso.nmProfessor = "Alessandro";

			newCurso.acessarCurso();
			System.out.println("-".repeat(35));

			newCurso.lecionarCurso();
			System.out.println("-".repeat(35));

			newCurso.atualizarCurso();

			break;

		case 3:
			RedeSocial newRede = new RedeSocial();

			newRede.nmRede = "Instagram";
			newRede.idRedeSocial = 1;
			newRede.qtUsuarios = 2000000;
			newRede.algoritmo = "Recomendação por engajamento";
			newRede.tipoConteudo = "Fotos e Vídeos";

			newRede.criarPerfil();
			System.out.println("-".repeat(35));

			newRede.enviarMensagem();
			System.out.println("-".repeat(35));

			newRede.atualizarAlgoritmo();
			break;

		default:
			System.out.println("Opção inválida!");
			break;
		}

	}

}
