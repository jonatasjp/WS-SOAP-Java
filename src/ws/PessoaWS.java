package ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import beans.Filtros;
import beans.ListaPessoas;
import beans.Pessoa;
import beans.Token;

@WebService
public class PessoaWS {

	@WebMethod(operationName="todasAsPessoas")
	@WebResult(name="pessoa")
	@ResponseWrapper(localName="pessoas")
	@RequestWrapper(localName="listaPessoas")
	public List<Pessoa> buscarPessoas(@WebParam(name="filtros") Filtros filtros) {
       
//		List<Filtro> lista = filtros.getLista();
        return ListaPessoas.criarPessoas(null);
	}
	
	@WebMethod(operationName="cadastrarPessoa")
	@WebResult(name="pessoa")
	public Pessoa cadastrarPessoa(Token token, Pessoa pessoa) {
		
		return pessoa;
	}
}
