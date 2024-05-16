package listaVIIQuestI;

public class LojaShopping extends Loja implements Registro{
	private String endereco;
	private String gerente;
	
	public LojaShopping(String cnpj, String razaoSocial, String endereco, String gerente) {
		super(cnpj, razaoSocial);
		this.endereco = endereco;
		this.gerente = gerente;
	}
	
	@Override
	public void dados() {
		String status;
		
		if (aberto) {
			status = "Está aberta!";
		}
		else {
			status = "Está fechada!";
		}
		
		System.out.println("CNPJ: " + cnpj + "\n" +
				"Razão Social: " + razaoSocial + "\n" +
				"Status da loja: " + status + "\n" +
				"Endereco: " + endereco + "\n" +
				"Gerente: " + gerente); 
	}
	
	@Override
	public void registra_abertura_dia() {
		if (aberto) {
			System.out.println("A loja já está aberta!");
		}
		else {
			aberto = true;
			System.out.println("Abrindo...");
		}
	}
	
	@Override
	public void registra_fechamento_dia() {
		if (!aberto) {
			System.out.println("A loja já está fechada!");
		}
		else {
			aberto = false;
			System.out.println("Fechando...");
		}
	}
}
