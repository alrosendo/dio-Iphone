package app.reprodutor;

public class Itunes implements Reprodutor {
    String musica = "My Way - Frank Sinatra "; 
	
	public void tocar() {
		System.out.println("reproduzindo: " + musica);
		
	}

	
	public void pausar() {
		System.out.println("pausando a reprodução da  musica");
		
	}

	
	public void selecionarMusica(String musica) {
		System.out.println("selecionado uma musica");
		
	}


}
