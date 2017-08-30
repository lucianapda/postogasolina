package modelo;

import java.sql.Date;

public class Compra {

	private int id;
	private String nomeFornecedor;
	private int idProduto;
	private double quantidade;
	private double valor;
	private Date  data;
	
	public Compra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compra(int id, String nomeFornecedor, int idProduto, double quantidade, double valor, Date data) {
		super();
		this.nomeFornecedor = nomeFornecedor;
		this.idProduto = idProduto;
		this.quantidade = quantidade;
		this.valor = valor;
		this.data = data;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getId() {
		return id;
	}
	
}
