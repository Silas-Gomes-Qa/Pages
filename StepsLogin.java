package pages;

//import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/*import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;*/

import Utils.Utils;
import drivers.DriversFactory;
import elementos.Elementos;
import metodos.MetodosDeTestes;
import navegadores.Executa;

public class StepsLogin extends DriversFactory {

	MetodosDeTestes metodo = new MetodosDeTestes();
	Elementos el = new Elementos();
	Utils massa = new Utils();
	HomePage home = new HomePage();

	@Before
	public void antesDoTest() {

		Executa.abrirNavegador();

	}

	@After
	public void depoisDoTest() {

		Executa.fecharNavegador();

	}

	@Test
	public void usuarioLogado() {

		home.login(massa.usuarioOk, massa.passwordOk, massa.titlePrincipal);
	}

	@Test
	public void usuarioEmBranco() {

		home.login("", "", massa.msgDadosBranco);

	}

	@Test
	public void senhaInvalida() {

		home.login(massa.usuarioOk, massa.passwordInvalida, massa.msgSenhaInvalida);
	}

	@Test
	public void usuarioBloq() {

		home.login(massa.usuarioBloq, massa.passwordOk, massa.msgUserBloq );
	}

	
}
