package pages;

import org.openqa.selenium.By;

import Utils.Utils;
import elementos.Elementos;
import metodos.MetodosDeTestes;

public class HomePage {

	public By username = By.xpath("//input[@placeholder='Username']");
	public By password = By.xpath("//input[@placeholder='Password']");
	public By btnLogin = By.id("login-button");
	public By msgErrorSenhaInvalida = By.xpath("//h3[@data-test='error']");
	public By msgErrorUserBloq = By.xpath("//*[text()='Epic sadface: Sorry, this user has been locked out.']");
	public By msgErrorUserInvalido = By
			.xpath("//h3[text()='Epic sadface: Username and password do not match any user in this service']");
	public By msgErrorBranco = By.xpath("//h3[text()='Epic sadface: Username is required']");
	public By msgError = By.xpath("//h3[@data-test='error']");

	MetodosDeTestes metodo = new MetodosDeTestes();
	Elementos el = new Elementos();
	Utils massa = new Utils();

	
	public void login(String username, String password, String texto) {
		metodo.escrever(this.username, username);
		metodo.escrever(this.password, password);
		metodo.clicar(btnLogin);
		if (texto.equals("Epic sadface: Username and password do not match any user in this service") || texto.equals("Epic sadface: Username is required") || texto.equals("Epic sadface: Sorry, this user has been locked out.")) {
			metodo.validarTexto(msgError, texto);

		} else {
			metodo.validarTitulo(texto);

		}

	}

}
