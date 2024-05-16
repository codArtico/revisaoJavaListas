package listaVIIQuestI;

public abstract class Loja {
	protected String cnpj;
	protected String razaoSocial;
	protected boolean aberto = false;
	
	
	
	public Loja(String cnpj, String razaoSocial) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}



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
				"Status da loja: " + status); 
	
	}
}
