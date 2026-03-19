package br.edu.fatecpg.tecprog.abstracao.model;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Projeto {
    private String nomeProjeto;
    private String descricaoProjeto;
    private String objetivoProjeto;
    private LocalDateTime dataInicioProjeto;
    private String estadoProjeto;

    public void criarProjeto() {
    	Scanner scan_criar = new Scanner(System.in);
        System.out.print("Nome do projeto: ");
        this.nomeProjeto = scan_criar.nextLine();
        
        System.out.print("Descrição do projeto: ");
        this.descricaoProjeto = scan_criar.nextLine();
        
        System.out.print("Objetivo do projeto: ");
        this.objetivoProjeto = scan_criar.nextLine();
        
        this.dataInicioProjeto = LocalDateTime.now();
    }

    public void editarDados() {
    	Scanner scan_editar = new Scanner(System.in);
        System.out.print("Novo nome: ");
        this.nomeProjeto = scan_editar.nextLine();
        
        System.out.print("Nova descrição: ");
        this.descricaoProjeto = scan_editar.nextLine();
        
        System.out.print("Novo objetivo: ");
        this.objetivoProjeto = scan_editar.nextLine();
        
        System.out.println("Dados editados com sucesso!");
    }
    
    public void alterarEstado() {
    	Scanner scan_estado = new Scanner(System.in);
    	
    	System.out.print("Qual estado o projeto esta: (1 - Andamento, 2 - Arquivado, 3 - Completo, 4 - Sair ");
    	int opcao = scan_estado.nextInt();
    	
    	do {
    	
	    	switch(opcao) {
	    		case 1:
	    			this.estadoProjeto = "Andamento";
	    			break;
	    		case 2:
	    			this.estadoProjeto = "Arquivado";
	    			break;
	    		case 3:
	    			this.estadoProjeto = "Completo";
	    			break;
	    		case 4: 
	    			System.out.print("Nao existe essa opcao");
	    			break;
	    		default:
	    			break;
	    	}
    	
    	} while (opcao > 5);
    }
}
