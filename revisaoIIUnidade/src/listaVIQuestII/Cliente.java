package listaVIQuestII;

public class Cliente extends Pessoa{
	private int codigo;
	
	Cliente(){}
	
	Cliente(String nome, String cpf, int codigo){
		super(nome,cpf);
		this.codigo = codigo;
	}
	
	@Override
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Codigo: " + codigo);
	}
	
}
