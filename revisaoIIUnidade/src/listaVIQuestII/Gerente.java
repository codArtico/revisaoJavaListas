package listaVIQuestII;

public class Gerente extends Funcionario{
	private int area;
	
	Gerente(){}
	Gerente(String nome, String cpf, String matricula, double salario, int area){
		super(nome,cpf,matricula,salario);
		this.area = area;
	}
	
	@Override
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Matricula: " + matricula);
		System.out.println("Salario: " + salario);
		System.out.println("Area: " + area);
	}
}
