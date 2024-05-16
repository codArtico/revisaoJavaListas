package listaVIQuestIII;

public class Aplicacao {

	public static void main(String[] args) {
		ContaEspecial e = new ContaEspecial("Raul", 500);
		ContaPadrao p = new ContaPadrao("Mikaelle", 500);
		
		System.out.println("Mostrando dados: ");
		e.sacar(1000);
		System.out.println(" ");
		System.out.println("----------------------------------------");
		System.out.println(" ");
		p.depositar(1000);
		
		// Resetando saldos
		
		e.setSaldo(500);
		p.setSaldo(500);
		
		// Usando os métodos de especial na padrão e de padrão na especial
		
		System.out.println("Mostrando dados: ");
		e.depositar(1000);
		System.out.println(" ");
		System.out.println("----------------------------------------");
		System.out.println(" ");
		p.sacar(1000);
	}

}
