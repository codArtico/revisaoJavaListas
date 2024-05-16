package listaVIIQuestI;

public class Aplicacao {
	public static void main(String[] args) {
		LojaShopping l1 = new LojaShopping("111", "Loja1", "Rua 1" , "Raul");
		LojaShopping l2 = new LojaShopping("222", "Loja2", "Rua 2" , "Mikaelle");
		LojaShopping l3 = new LojaShopping("333", "Loja3", "Rua 3" , "Francielly");
		
		// Abrindo lojas
		l1.registra_abertura_dia();
		l2.registra_abertura_dia();
		l3.registra_abertura_dia();
		
		// Abrindo uma loja já aberta
		l1.registra_abertura_dia();
		l2.registra_abertura_dia();
		l3.registra_abertura_dia();
		
		//Mostrando dados
		System.out.println("Mostrando dados: ");
		l1.dados();
		System.out.println(" ");
		System.out.println("----------------------------------------");
		System.out.println(" ");
		l2.dados();
		System.out.println(" ");
		System.out.println("----------------------------------------");
		System.out.println(" ");
		l3.dados();
		
		// Fechando lojas
		l1.registra_fechamento_dia();
		l2.registra_fechamento_dia();
		l3.registra_fechamento_dia();
		
		// Fechando lojas já fechadas
		l1.registra_fechamento_dia();
		l2.registra_fechamento_dia();
		l3.registra_fechamento_dia();
		
	}
}
