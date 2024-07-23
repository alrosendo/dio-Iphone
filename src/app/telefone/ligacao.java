package app.telefone;

public class ligacao implements Telefone {

	String numero = "996698564";
	
	public void ligar(String numero) {
		System.out.println("fazendo uma ligação pelo Iphone para : " + numero);
		
	}

	
	public void atender() {
		System.out.println("Atendendo uma ligação pelo Iphone");
		
	}

	
	public void iniciarCorreioVoz() {
		System.out.println("iniciando uma correio de voz pelo Iphone");
		
	}

}
