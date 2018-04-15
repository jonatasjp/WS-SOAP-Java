package ws;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import beans.Filtro;
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
		List<Filtro> lista = Optional.ofNullable(filtros).map(Filtros::getLista).orElse(new ArrayList<>());
        return ListaPessoas.buscarPessoas(lista);
	}
	
	@WebMethod(operationName="cadastrarPessoa")
	@WebResult(name="pessoa")
	public Pessoa cadastrarPessoa(@WebParam(name="token") Token token, 
			@WebParam(name="pessoa") Pessoa pessoa) {
		
		return pessoa;
	}
}
