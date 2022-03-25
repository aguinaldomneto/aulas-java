package br.com.dio;

import br.com.dio.model.gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		gato gato = new gato ();
		Livros livros = new Livros();
		Receitas receitas = new Receitas();
		
		System.out.println(gato);
		System.out.println(livros);
		System.out.println(receitas);

	} 

}

class Livros {
	private String nome;
	private String npag;
	
}

	class Receitas {
		private String bolo;
		private String pudim;
	}