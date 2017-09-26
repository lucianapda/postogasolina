package modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Compra {

	private int id;
	private String nomeFornecedor;
	private int idProduto;
	private double quantidade;
	private double valor;
	private int  data;
	
	public Compra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compra(String nomeFornecedor, int idProduto, double quantidade, double valor, int data) {
		super();
		this.nomeFornecedor = nomeFornecedor;
		this.idProduto = idProduto;
		this.quantidade = quantidade;
		this.valor = valor;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}	
	
}
