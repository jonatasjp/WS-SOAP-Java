package beans;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListaPessoas {
	
	private ListaPessoas() {}
	
	private static List<Pessoa> pessoas;
	
	public static List<Pessoa> buscarPessoas(List<Filtro> lista) {
		
		if(pessoas == null) {
			criarPessoas();
		}
		
		List<String> filtros = lista.stream().map(filtro -> filtro.getNome().toUpperCase()).collect(Collectors.toList());
		return pessoas.stream().filter(pessoa -> filtros.contains(pessoa.getNome().toUpperCase())).collect(Collectors.toList());
	}

	public static void criarPessoas() {
		
		Pessoa pessoa = new Pessoa("jonatas", "luis", "12345678912");
		Pessoa pessoa1 = new Pessoa("andre", "luis", "84646846848");
		Pessoa pessoa2 = new Pessoa("joao", "luis", "56468468468");
		Pessoa pessoa3 = new Pessoa("jose", "luis", "31531515138");
		Pessoa pessoa4 = new Pessoa("fabio", "luis", "35546468488");

		pessoas = Arrays.asList(pessoa,pessoa1,pessoa2,pessoa3,pessoa4);
	}

	
}
