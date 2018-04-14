package teste;

import javax.xml.ws.Endpoint;

import ws.PessoaWS;

public class TesteWS {

	public static void main(String[] args) {
		
		PessoaWS servico = new PessoaWS();
		String url = "http://localhost:8080/pessoaws";
		
		Endpoint.publish(url, servico);
		
	}
}
