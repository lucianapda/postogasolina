package modelo;

import java.sql.Date;

public class Produto {

	private int id;
	private String nome;
	private Double quantidade;
	private Double valor;
	private String descricao;
	
	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produto(String nome, Double quantidade, Double valor, String descricao) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
		this.descricao = descricao;
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
