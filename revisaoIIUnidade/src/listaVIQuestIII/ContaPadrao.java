package listaVIQuestIII;

public class ContaPadrao extends Conta{

	public ContaPadrao(String titular, double saldo) {
		super(titular, saldo);
	}
	
	@Override
	public void depositar(double valor) {
		if(valor>0) {
			saldo += valor+(valor/4);
			System.out.println("Depósito realizado com sucesso! Seu saldo agora é de: " + saldo);
		}
		
		else {
			System.out.println("Digite um valor valido!");
		}
	}
}
