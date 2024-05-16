package listaVIQuestII;

public class Pessoa {
	protected String nome;
	protected String cpf;
	
	Pessoa(){}
	Pessoa(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
	}
}
