package br.com.base.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Page{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getUsuario() {
		return getElement(".//*[@id='form-item-email']/div/input");
	}
	
	public void setUsuario(String usuario) {
		getUsuario().sendKeys(usuario);
	}
	
	public WebElement getSenha() {
		return getElement(".//*[@id='form-item-password']/div/input");
	}
	
	public void setSenha(String senha) {
		getSenha().sendKeys(senha);
	}
	
	public WebElement getButtonLogin() {
		return getElement("//*[@class='btn btn-quaternary']");
	}

	public void clickButtonLogin() {
		getButtonLogin().click();
	}
	
	public WebElement getButtonSubmit() {
		return getElement(".//*[@id='submit-id-submit']");
	}
	
	public void clickButtonSubmit() {
		getButtonSubmit().click();
	}
	
	public WebElement getInputProcurarCurso() {
		return getElement(".//*[@class='dropdown es-autocomplete es-autocomplete--primary']//input[@id='header-search-field']");
	}
	
	public void clickInputProcurarCurso() {
		getInputProcurarCurso().click();
	}
	
	public void setInputProcurarCurso(String curso) {
		getInputProcurarCurso().sendKeys(curso);
	}
	
	public WebElement getButtonPesquisarCurso() {
		return getElement("//span[@class='input-group-btn']/button");
	}
	
	public void clickButtonPesquisarCurso() {
		getButtonPesquisarCurso().click();
	}
	
	public WebElement getResultadosCursos() {
		return getElement(".//*[@id='search-result-page-v3']/div/div/div[2]/div/div/div");
	}
}
