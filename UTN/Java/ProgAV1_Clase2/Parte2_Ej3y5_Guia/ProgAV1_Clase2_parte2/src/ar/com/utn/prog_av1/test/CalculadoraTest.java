package ar.com.utn.prog_av1.test;

import org.junit.Test;
import org.junit.Assert;

import ar.com.utn.prog_av1.practica.Calculadora;
import ar.com.utn.prog_av1.practica.exceptionZeroDivide;

public class CalculadoraTest {

	@Test
	public void stestSumar()
	{
		Calculadora calc = new Calculadora();

		Double res = calc.sumar(0, -1);
		Assert.assertEquals( Double.valueOf(-1D), res);
	}

	@Test
	public void testRestar()
	{
		Calculadora calc = new Calculadora();

		Double res = calc.restar(5, 8);
		Assert.assertEquals(Double.valueOf(-3), res);
	}

	@Test
	public void testMultiplicar()
	{
		Calculadora calc = new Calculadora();

		Double res = calc.multiplicar(5, 4);
		Assert.assertEquals( Double.valueOf(20), res);
	}

	@Test
	public void testDividir() throws exceptionZeroDivide
	{
		Calculadora calc = new Calculadora();
		
		try
		{
			Double res = calc.dividir(5, 0);
			Assert.assertEquals( Double.valueOf(2.5) , res);
		}
		catch( Exception e )
		{
			Assert.fail( e.getMessage() );
		}
	}


}
