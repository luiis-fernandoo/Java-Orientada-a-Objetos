package Sisteminha;

import javax.swing.JOptionPane;

public class Produto {

	private String nomeProduto;
	private String codProduto;
	private int lote;
	private Double preco;
	private int estoque;
	
	public Produto (String nomeProduto, String codProduto, int lote, double preco, int estoque) {
		this.nomeProduto = nomeProduto;
		this.codProduto = codProduto;
		this.lote = lote;
		this.preco = preco; 
		this.estoque = estoque;
	}
	
	
	public String getNomeProduto() {
		return nomeProduto;
	}


	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}


	public String getCodProduto() {
		return codProduto;
	}


	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}


	public int getLote() {
		return lote;
	}


	public void setLote(int lote) {
		this.lote = lote;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}


	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}


	public void MostrarProduto() {
		JOptionPane.showMessageDialog(null, "Produto: " + getNomeProduto() + "\nCodigo: " + getCodProduto() + "\nLote: " + getLote() + "\nPreço: " + getPreco() + "\nEstoque: " + getEstoque());
	}
}

