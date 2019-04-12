package Bens;

import java.util.Date;

public class BensDeConsumo extends Bens {

	private int quantidade;
	private Date dataVailidade;

	// gets e sets
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getDataVailidade() {
		return dataVailidade;
	}

	public void setDataVailidade(Date dataVailidade) {
		this.dataVailidade = dataVailidade;
	}
	// Fim dos gets e sets

	// metodos

	public void reabastecer(int quantidade) {
		this.quantidade = this.quantidade + quantidade;
	}
	public void solicitarBemDeConsumo(int quantidade) {
		this.quantidade = this.quantidade - quantidade;
	}
	// Fim dos metodos
}
