package ar.com.utn.prog_av1.test;

import org.junit.Assert;
import org.junit.Test;

import ar.com.utn.prog_av1.excepciones.Calculadora;

public class CalculadoraTest {

	@Test
	public void sumaNumeros()
	{
		
		Calculadora calc = new Calculadora();
		int res = 0;
		
		try
		{
			res = calc.suma(1, 2);
			Assert.assertEquals(2, res);
		}
		catch ( Exception e )
		{
			Assert.fail();
		}

		/*if ( res == 2 )
		{
			System.out.println("Suma de " + i + " + " + j + " es = 2 ");
		}
		else
		{
			System.out.println("ERROR: Suma de " + i + " + " + j + " es != 2 ");
		}*/

	}
	
	@Test
	public void restaNumeros()
	{
		
	}
	
	@Test
	public void multiplicaNumeros()
	{
		
	}
	
	@Test
	public void divideNumeros()
	{

		Calculadora calc = new Calculadora();
		int res = 0;
		
		try
		{
			res = calc.divide(2, 1);
			Assert.assertEquals(2, res);
		}
		catch ( Exception e )
		{
			Assert.fail(e.getMessage() + " con (1, 0)");
		}

	}

}
