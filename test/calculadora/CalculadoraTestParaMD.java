package calculadora;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith (value = Parameterized.class)


public class CalculadoraTestParaMD {

double num1;	
double num2;
double resultExperado;

double num3;	
double num4;
double resultExperado2;



Calculadora objetoCalculadora = new Calculadora();

// constructor


	public CalculadoraTestParaMD(double num1, double num2, double resultExperado, double num3, double num4,
		double resultExperado2) {
	this.num1 = num1;
	this.num2 = num2;
	this.resultExperado = resultExperado;
	this.num3 = num3;
	this.num4 = num4;
	this.resultExperado2 = resultExperado2;
}


	@Parameters
	public static Collection<Object[]> data() {
	Object[][] data = new Object[][] { 
		{6,4,24,5,5,1}, 
		{8,2,16,50,10,5}, 
		{10,2,24,30,3,9}, // contexto para multiplicaTest y divideTest erroneos
		{10,20,200,60,3,20} 
		} ;
	return Arrays.asList(data);
	}



	@Test
	public void multiplicaTest() {
		
		objetoCalculadora.setNum1(this.num1);
		objetoCalculadora.setNum2(this.num2);
		double esperado = this.resultExperado;
		double resultado = objetoCalculadora.multiplicacion();
		Assert.assertEquals(esperado, resultado, 0.0);
		//fail("No implementado aun");
	}
	
	@Test
	public void divideTest() {
		
		objetoCalculadora.setNum1(this.num3);
		objetoCalculadora.setNum2(this.num4);
		double esperado = this.resultExperado2;
		double resultado = objetoCalculadora.division();
		Assert.assertEquals(esperado, resultado, 0.0);
		//fail("No implementado aun");
	}

}
