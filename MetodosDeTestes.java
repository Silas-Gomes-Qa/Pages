package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
/*import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;*/

import drivers.DriversFactory;

public class MetodosDeTestes extends DriversFactory{
	
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
		
	}
	
	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, textoCapturado);
		
	}
	
	public void validarTitulo(String tituloEsperado) {
		assertEquals(tituloEsperado, driver.getTitle());
		
	}
	
	public void validarUrl(String urlEsperado) {
		assertEquals(urlEsperado, driver.getCurrentUrl());
		
	}
	
	
	
}
