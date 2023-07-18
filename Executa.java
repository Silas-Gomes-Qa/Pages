package navegadores;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends DriversFactory{
	
	public static void abrirNavegador() { 
		ChromeOptions options = new ChromeOptions();//Opções do chrome
		options.addArguments("--disable-notifications");//Desabilitar notificações como pop-ups
		WebDriverManager.chromedriver().setup();//Configuração do navegador
		driver = new ChromeDriver();//Novo browser
		driver.get("https://www.saucedemo.com/");//Site desejado
		driver.manage().window().maximize();//gerenciar janela e maximinizar
		
	}

	public static void fecharNavegador() {
		driver.quit();
		
	}

}
