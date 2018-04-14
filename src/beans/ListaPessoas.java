package beans;

import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaPessoas {
	
	@XmlElement(name="pessoa")
	private List<Pessoa> pessoas;
	
	private ListaPessoas() {}
	
	public static ListaPessoas criarPessoas() {
		
		Pessoa pessoa = new Pessoa("jonatas", "luis", "12345678912");
		Pessoa pessoa1 = new Pessoa("andre", "luis", "84646846848");
		Pessoa pessoa2 = new Pessoa("joao", "luis", "56468468468");
		Pessoa pessoa3 = new Pessoa("jose", "luis", "31531515138");
		Pessoa pessoa4 = new Pessoa("fabio", "luis", "35546468488");
		
		ListaPessoas listaPessoas = new ListaPessoas();
		listaPessoas.setPessoas(Arrays.asList(pessoa,pessoa1,pessoa2,pessoa3,pessoa4));
		
		return listaPessoas;
	}
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
}
