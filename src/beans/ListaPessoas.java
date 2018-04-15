package beans;

import java.util.Arrays;
import java.util.List;

public class ListaPessoas {
	
	public static List<Pessoa> criarPessoas(List<Filtro> lista) {
		
		Pessoa pessoa = new Pessoa("jonatas", "luis", "12345678912");
		Pessoa pessoa1 = new Pessoa("andre", "luis", "84646846848");
		Pessoa pessoa2 = new Pessoa("joao", "luis", "56468468468");
		Pessoa pessoa3 = new Pessoa("jose", "luis", "31531515138");
		Pessoa pessoa4 = new Pessoa("fabio", "luis", "35546468488");

		return Arrays.asList(pessoa,pessoa1,pessoa2,pessoa3,pessoa4);
	}
	
}
