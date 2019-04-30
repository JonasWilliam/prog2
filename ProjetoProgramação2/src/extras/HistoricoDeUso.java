package extras;

import bens.Bens;
import funcionarios.Funcionarios;

public class HistoricoDeUso {

	private Bens bem;
	private Funcionarios funcionario;
	private Data dataDoOcorrido;
	private Setor setorSolicitante;
	
	//Construtor
	HistoricoDeUso(Bens bem,Funcionarios funcionario,Data dataDoOcorrido,Setor setorSolicitante){
		this.bem = bem;
		this.dataDoOcorrido = dataDoOcorrido;
		this.funcionario = funcionario;
		this.setorSolicitante = setorSolicitante;
	}
	//Fim do Construtor

	//gets e sets
	
	public Bens getBem() {
		return bem;
	}

	public void setBem(Bens bem) {
		this.bem = bem;
	}

	public Funcionarios getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionarios funcionario) {
		this.funcionario = funcionario;
	}

	public Data getDataDoOcorrido() {
		return dataDoOcorrido;
	}

	public void setDataDoOcorrido(Data dataDoOcorrido) {
		this.dataDoOcorrido = dataDoOcorrido;
	}

	public Setor getSetorSolicitante() {
		return setorSolicitante;
	}

	public void setSetorSolicitante(Setor setorSolicitante) {
		this.setorSolicitante = setorSolicitante;
	}
	
	//Fim dos gets e sets
	
	//Metodos
	
	// em fase de criação
	/*public void exibirHistorico(Bens bem) {
		 System.out.println(bem.getCodigo());
		 System.out.println(bem.getNome());
		
	}
*/
}

