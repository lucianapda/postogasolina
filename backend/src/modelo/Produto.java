package modelo;

import java.sql.Date;

public class Produto {

	private int id;
	private int idProduto;
	private Double quantidade;
	private Double valor;
	private String descricao;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(int idProduto, Double quantidade, Double valor, String descricao) {
		super();
		this.idProduto = idProduto;
		this.quantidade = quantidade;
		this.valor = valor;
		this.descricao = descricao;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}
	
}
