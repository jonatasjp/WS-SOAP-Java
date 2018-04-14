package beans;

import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pessoa {

	private String nome;
	private String sobrenome;
	private String cpf;

	public Pessoa() {}
	
	public Pessoa(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	public static List<Pessoa> criarPessoas() {
		
		Pessoa pessoa = new Pessoa("jonatas", "luis", "12345678912");
		Pessoa pessoa1 = new Pessoa("andre", "luis", "84646846848");
		Pessoa pessoa2 = new Pessoa("joao", "luis", "56468468468");
		Pessoa pessoa3 = new Pessoa("jose", "luis", "31531515138");
		Pessoa pessoa4 = new Pessoa("fabio", "luis", "35546468488");
		
		return  Arrays.asList(pessoa,pessoa1,pessoa2,pessoa3,pessoa4);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
