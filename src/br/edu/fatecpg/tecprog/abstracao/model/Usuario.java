package br.edu.fatecpg.tecprog.abstracao.model;
import java.time.LocalDateTime;
import java.util.*;

public class Usuario {
	public String nomeUsuario;
	public String contatoUsuario;
	public String tipoUsuario;
	public LocalDateTime dataCadastroUsuario;
	public String identificadorPublicoUsuario;
	
	public void criarConta() {
		this.dataCadastroUsuario = LocalDateTime.now();
		System.out.print("Bem vindo" + this.identificadorPublicoUsuario + ", ao nosso sistema.");
	}
	
	public void autenticarConta() {
		Random random = new Random();
		int numero = random.nextInt(1000000);
		Scanner scan = new Scanner(System.in);
		String codigo = String.format("%06d", numero);
		System.out.print("Informe o codigo de verificação" + codigo);
		
		boolean cont;
		do {
			String codigousuario = scan.nextLine();
			if (codigousuario.equals(codigo)) {
				cont = true;
			} else {
				cont = false;
			}
		} while (cont != true);
		System.out.print("Bem vindo de volta" + this.identificadorPublicoUsuario + " ao nosso sistema.");
	}
	
	public void editarConta() {
		System.out.print("Dados editados com sucesso");
	}
}
