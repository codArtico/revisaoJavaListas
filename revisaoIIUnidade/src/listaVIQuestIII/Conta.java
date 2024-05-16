package listaVIQuestIII;

public class Conta {
	protected String titular;
	protected double saldo;
	
	
	
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public void sacar (double valor) {
		if(valor>0 && valor<=saldo) {
			saldo -= valor;
			System.out.println("Saque realizado com sucesso! Seu saldo agora é de: " + saldo);
		}
		else {
			if(valor<=0) {
				System.out.println("Insira um valor válido!");
			}
			else {}
			System.out.println("Seu saldo é insuficiente! Seu saldo é de: " + saldo);
		}
	}
		public void depositar (double valor) {
			if(valor>0) {
				saldo += valor;
				System.out.println("Depósito realizado com sucesso! Seu saldo agora é de: " + saldo);
			}
			
			else {
				System.out.println("Digite um valor valido!");
			}
	}
		
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
}
