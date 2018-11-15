package br.com.base.steps;

import java.util.Map;

import br.com.base.funcionalidades.LoginFuncionalidade;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LoginStep {
	
	static LoginFuncionalidade loginFuncionalidade = new LoginFuncionalidade();
	
	@Dado("^que estou logado no portal com as credenciais$")
	public void logar(DataTable credenciais) throws Throwable {
		loginFuncionalidade.goToLogin();
		for (Map<String, String> map : credenciais.asMaps(String.class, String.class)) {
			loginFuncionalidade.realizaLogin(map.get("usuario"), map.get("senha"));
		}
	}
	
	@Quando("^procurar um curso$")
	public void procurarUmCurso(DataTable curso) throws Throwable {
		for (Map<String, String> map : curso.asMaps(String.class, String.class))
		loginFuncionalidade.procurarCurso(map.get("curso"));
	}
	
	@Entao("e exibido no portal a lista de cursos disponiveis")
	public void exibirCursosDisponiveis() throws Throwable {
		loginFuncionalidade.isResultadosCursos();
	}
}
