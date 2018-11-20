package br.com.senai.fatesg.controleponto.teste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSlenium_Login {
	public static void main(String[] args) throws InterruptedException{  
		System.setProperty("webdriver.chrome.driver", "C:\\AmbienteTrabalho\\bibliotecas\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:8180/primefaces/funcionario.xhtml");
	    driver.manage().window().maximize();	    
	    driver.findElement(By.name("j_username")).sendKeys("admin");
	    driver.findElement(By.name("j_password")).sendKeys("123456");
	    driver.findElement(By.id("loginHome") ).click();
	    
	    try {
	    	Thread.sleep(10000);
	    }catch (InterruptedException e) {
	    	e.printStackTrace();
	    }	    
	    //String at = driver.getTitle();
	    //String et = "Título aqui";
	    driver.close();	    
    }

}
