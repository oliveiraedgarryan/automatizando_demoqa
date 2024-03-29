package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;

import elementos.Elementos;
import metodos.Metodos;
import navagadores.Navegadores;
import pages.AlertsPage;





/**
 * Class responsável por fazer os testes
 * 
 * @param alerts
 * @author Edgar Ryan
 */

public class ValidarAlerts extends Navegadores{
	
	
	//Mensagens exibidas após cada click
	String msg1 = "You clicked a button";
	String msg2 = "This alert appeared after 5 seconds";
	String msg3 = "You selected Ok";
	String msg4 = "You entered Edgar";
	
	@BeforeEach
	public void setup () {
		Navegadores.abrirNavegador();
		AlertsPage.escolherCard("Alerts, Frame & Windows");
		AlertsPage.escolherAba(Elementos.alerts);
		
	}
	
	@AfterEach 
	public void afterTest() {
		Navegadores.fecharNavegador();
		
	}
	
	
	@Test
	public void validarClick1() {
		AlertsPage.escolherBotao(Elementos.click1);
		AlertsPage.textAlert(msg1);
		Metodos.clicarAlert();

	}
	@Test
	public void validarClick2() throws InterruptedException {
		AlertsPage.escolherBotao(Elementos.click2);
		AlertsPage.pausaAlert();
		AlertsPage.textAlert(msg2);
		Metodos.clicarAlert();

	}
	@Test
	public void validarClick3()  {
		AlertsPage.escolherBotao(Elementos.click3);
		Metodos.clicarAlert();
		AlertsPage.validarTexto(Elementos.msgBt3, msg3);
		
		

	}
	@Test
	public void validarClick4()  {
		AlertsPage.escolherBotao(Elementos.click4);
		AlertsPage.escreverAlert("Edgar");
		Metodos.clicarAlert();
		AlertsPage.validarTexto(Elementos.msgbt4, msg4);
		
		
		

	}
	
	
	


}
