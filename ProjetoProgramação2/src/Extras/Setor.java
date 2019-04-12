package Extras;

import Funcionários.GestorDeSetor;

public class Setor {

	private int codigo;
	private String nome;
	private GestorDeSetor gestor;
	
	
	// Construtores
	
	Setor(int codigo,String nome){
		this.codigo = codigo;
		this.nome = nome;
	}
	// fim dos construtores
	
	
	
	//Metodos
	
	
	public Setor exibirDetalhesSetor() {
		return null;
		
	}
	public void addNovoSetor(int codigo,String nome,GestorDeSetor gestor) {
		
		this.codigo = codigo;
		this.gestor = gestor;
		this.nome = nome;
	}
	public void listarSetor() { /*aqui vai ser uma lista?*/
		
	}
	public void removerSetor() {
		
	}
	public void alterarSetor() {
		
	}
	
	
	// fim dos Metodos
	
	
	
	//gets e sets
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public GestorDeSetor getGestor() {
		return gestor;
	}
	public void setGestor(GestorDeSetor gestor) {
		this.gestor = gestor;
	}
	
	// fim dos gets e sets
	
}
