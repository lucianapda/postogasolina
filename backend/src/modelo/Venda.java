package modelo;

import java.sql.Date;

public class Venda {

	
	private int id;
	private int idProduto;
	private Double quantidade;
	private Double valor;
	private Date data;
	private boolean statusPagamento;
	
	public Venda() {
		// TODO Auto-generated constructor stub
	}

	public Venda(int idProduto, Double quantidade, Double valor, Date data, boolean statusPagamento) {
		super();
		this.idProduto = idProduto;
		this.quantidade = quantidade;
		this.valor = valor;
		this.data = data;
		this.statusPagamento = statusPagamento;
	}

	public int getNomeProduto() {
		return idProduto;
	}

	public void setNomeProduto(int idProduto) {
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public boolean isStatusPagamento() {
		return statusPagamento;
	}

	public void setStatusPagamento(boolean statusPagamento) {
		this.statusPagamento = statusPagamento;
	}

	public int getId() {
		return id;
	}
	
	}
