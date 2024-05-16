package listaVIQuestII;

public class Funcionario extends Pessoa{
	protected String matricula;
	protected double salario;
	
	Funcionario(){}
	Funcionario(String nome, String cpf, String matricula, double salario){
		super(nome,cpf);
		this.matricula = matricula;
		this.salario = salario;
	}
	
	@Override
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Matricula: " + matricula);
		System.out.println("Salario: " + salario);
	}
	
}
