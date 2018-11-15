package br.com.base.funcionalidades;

import org.openqa.selenium.WebDriver;

import br.com.base.pageobjects.LoginPage;
import br.com.base.util.Navegacao;

public class LoginFuncionalidade {

	private WebDriver driver;
	private LoginPage login;
	private String url = "https://www.udemy.com/";
	
	public LoginFuncionalidade() {
		login = new LoginPage(Navegacao.getChromeDriver());
		driver = Navegacao.getChromeDriver();
	}
	
	public void goToLogin() {
		driver.get(url);
	}
	
	public void realizaLogin(String usuario, String senha) {
		login.clickButtonLogin();
		login.setUsuario(usuario);
		login.setSenha(senha);
		login.clickButtonSubmit();
	}
	
	public void procurarCurso(String curso) {
		login.clickInputProcurarCurso();
		login.setInputProcurarCurso(curso);
		login.clickButtonPesquisarCurso();
	}
	
	public Boolean isResultadosCursos() {
		if (login.getResultadosCursos().isDisplayed()) {
			return true;
		} else {
			System.out.println("NOK");
			return false;
		}
	}
	
}
