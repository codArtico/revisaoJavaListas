package listaVIQuestIII;

public class ContaEspecial extends Conta{

	public ContaEspecial(String titular, double saldo) {
		super(titular, saldo);
	}
	
	@Override
	public void sacar(double valor) {
		if(valor>0 && valor<=(saldo+500)) {
			saldo -= valor;
			System.out.println("Saque realizado com sucesso! Seu saldo agora é de: " + saldo);
		}
		else {
			if(valor<=0) {
				System.out.println("Insira um valor válido!");
			}
			else {
			System.out.println("Seu saldo é insuficiente! Seu saldo é de: " + saldo);
			}
		}
	}
}
