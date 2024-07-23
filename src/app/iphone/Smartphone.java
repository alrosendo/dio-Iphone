package app.iphone;

import app.navegardor.Navegador;
import app.reprodutor.Reprodutor;
import app.telefone.Telefone;

public class Smartphone implements Reprodutor, Telefone, Navegador  {
	String url = "https://dio.me/";
	
	public void exibirPagina() {
		System.out.println("exibindo : " + url + "no Iphone");
		
	}

	
	public void adicionarNovaAba() {
		System.out.println("adicionando nova Aba pelo google chrome no Iphone");
		
	}

	
	public void atualizarPagina() {
		System.out.println("atualizando a pagina da  internet pelo google chrome no iphone");
		
	}

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

	String musica = "My Way - Frank Sinatra "; 
	public void tocar() {
		System.out.println("reproduzindo: " + musica);
		
	}

	
	public void pausar() {
		System.out.println("pausando a reprodução da  musica e video pelo meu Iphone");
		
	}

	
	public void selecionarMusica(String musica) {
		System.out.println("selecionado uma musica e video pelo meu Iphone " + musica);
		
	}

}
