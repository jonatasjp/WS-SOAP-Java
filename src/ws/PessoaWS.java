package ws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import beans.ListaPessoas;

@WebService
public class PessoaWS {

	@WebMethod(operationName="todasAsPessoas")
	@WebResult(name="pessoas")
	public ListaPessoas buscarPessoas() {
		return ListaPessoas.criarPessoas();
	}
}
