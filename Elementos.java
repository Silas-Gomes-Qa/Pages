package elementos;

import org.openqa.selenium.By;

public class Elementos {

			public By username = By.xpath("//input[@placeholder='Username']");
			public By password = By.xpath("//input[@placeholder='Password']"); 
			public By btnLogin =  By.id("login-button");
			public By msgErrorSenhaInvalida = By.xpath("//h3[@data-test='error']"); 
			public By msgErrorUserBloq = By.xpath("//*[text()='Epic sadface: Sorry, this user has been locked out.']" ); 
			public By msgErrorUserInvalido = By.xpath("//h3[text()='Epic sadface: Username and password do not match any user in this service']"); 
			public By msgErrorBranco = By.xpath("//h3[text()='Epic sadface: Username is required']"); 
			public By buttonBurguer = By.id("react-burger-menu-btn"); 
			public By about = By.id("about_sidebar_link"); 
			public By logout = By.id("logout_sidebar_link");
			public By carrinho = By.xpath("//a[@class='shopping_cart_link']");
			public By tituloCarrinho = By.xpath("//span[@class='title']"); 
			public By filtro = By.xpath("//select[@class='product_sort_container']"); 
			public By filtroAaZ = By.xpath("//option[@value='az']"); 
			public By filtroZaA = By.xpath("//option[@value='za']");
			public By filtroMenorPreco = By.xpath("//option[@value='lohi']");
			public By AaZ = By.xpath("//div[text()='Sauce Labs Backpack']"); 
			public By ZaA = By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']"); 
			public By menorPreco = By.xpath("//div[text()='7.99']");
}
