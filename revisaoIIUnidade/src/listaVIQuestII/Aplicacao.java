package listaVIQuestII;

public class Aplicacao {

	public static void main(String[] args) {
		 Cliente c = new Cliente ("Raul", "123", 1);
		 Gerente g = new Gerente ("Mikaelle", "456", "789",4000,1);
		 
		 System.out.println("Mostrando dados: ");
		 c.mostrarDados();
		 System.out.println(" ");
		 System.out.println("----------------------------------------");
		 System.out.println(" ");
		 g.mostrarDados();

	}

}
