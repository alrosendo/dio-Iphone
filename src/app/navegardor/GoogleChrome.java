package app.navegardor;

public class GoogleChrome implements Navegador {
	    String url = "https://dio.me/";
	
		public void exibirPagina() {
		System.out.println("exibindo : " + url);
		
	}

		public void adicionarNovaAba() {
			System.out.println("adicionando nova Aba pelo google chrome");
			
		}

		public void atualizarPagina() {
			System.out.println("atualizando a pagina da  internet pelo google chrome");
			
		}
}
