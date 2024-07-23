package Iphone;

import app.iphone.Smartphone;
import app.navegardor.*;
import app.reprodutor.*;
import app.telefone.*;
public class Aparelho {

	

	public static void main(String[] args) {
		Smartphone sp = new Smartphone();
		Navegador navegador = sp;
		Reprodutor reprodutor = sp;
		Telefone telefone = sp;
		
		navegador.exibirPagina();
		navegador.adicionarNovaAba();
		navegador.atualizarPagina();
		reprodutor.tocar();
		reprodutor.selecionarMusica("my way - frank sinatra");
		reprodutor.pausar();
		telefone.ligar("84998745236");
		telefone.atender();
		telefone.iniciarCorreioVoz();

	}

}
