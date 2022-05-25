package calculadora;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTestSR {

	Calculadora objetoCalculadora = new Calculadora();
	
	@BeforeClass
	public static void fin() {
		System.out.println(" Comienzan los test....");
	}
	
	@AfterClass
	public static void inicio() {
		System.out.println(" Fin de los test..."); 
	}
	
	
	
	@Test
	public void sumaTest() {
		System.out.println("  ejecutando sumaTest....");
		objetoCalculadora.setNum1(50);
		objetoCalculadora.setNum2(20);
		double experado = 70;
		double resultado = objetoCalculadora.suma();
		Assert.assertEquals(experado, resultado, 0.0);
		
		//fail("No implementado aun");
	}
	
	@Test
	public void restaTest() {
		System.out.println("  ejecutando restaTest....");
		objetoCalculadora.setNum1(90);
		objetoCalculadora.setNum2(5);
		double experado = 80;
		double resultado = objetoCalculadora.resta();
		Assert.assertEquals(experado, resultado, 0.0);
		
		//fail("No implementado aun");
	}

}
