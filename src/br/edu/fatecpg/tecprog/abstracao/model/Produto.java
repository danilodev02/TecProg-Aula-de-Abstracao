package br.edu.fatecpg.tecprog.abstracao.model;

public class Produto {
	public String nmProduto;
	public int idProduto;
	public double valorProduto;
	public int qtEstoque;
	public String categoriaProduto;

	public void venderProduto() {
		if (qtEstoque > 0) {
			qtEstoque--;
			System.out.println("Venda concluída! Estoque restante: " + qtEstoque);
		} else {
			System.out.println("Produto sem estoque!");
		}
	}

	public void excluirProduto() {
		System.out.println(this.nmProduto + " retirado de catálogo");
	}

	public void consultarProduto() {
		System.out.println(this.nmProduto + "\nValor: " + this.valorProduto + "\ncódigo: " + this.idProduto
				+ "\ncategoria: " + this.categoriaProduto + "\nquantidade em estoque: " + this.qtEstoque + "");
	}
}
