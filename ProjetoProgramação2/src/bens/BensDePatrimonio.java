package bens;

import java.util.Date;

public class BensDePatrimonio extends Bens {

	private int numeroIdentidade;
	private String estadoConservacao;
	private Date dataAquisicao;

	// gets e sets

	public int getNumeroIdentidade() {
		return numeroIdentidade;
	}

	public void setNumeroIdentidade(int numeroIdentidade) {
		this.numeroIdentidade = numeroIdentidade;
	}

	public String getEstadoConservacao() {
		return estadoConservacao;
	}

	public void setEstadoConservacao(String estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
	}

	public Date getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(Date dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	
	//Fim dos gets e sets
	
	
	// m�todos

	public void atualizarEstadoConservacao(String novoEstadoConservacao) {
		this.estadoConservacao = novoEstadoConservacao;
	}

}
