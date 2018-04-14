package ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import beans.Pessoa;

@WebService
public class PessoaWS {

	@WebMethod
	public List<Pessoa> buscarPessoas() {
		return Pessoa.criarPessoas();
	}
}
