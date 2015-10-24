package ar.com.utn.prog_av1.excepciones;

import ar.com.utn.prog_av1.test.CalculadoraTest;

public class Principal {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Integer num1 = 1;
		Double num2 = 1D; /*Casteo automatico a Double*/
		Long num3 = 1L; /*Casteo automatico a Long*/

		Double num4 = 1.0;
		Long num5 = Long.valueOf("15123");
		
		Integer num6 =  new Integer(123);
		
		System.out.println(num5);
		
		System.out.println(num4.doubleValue());
		
		System.out.println(num6.toString());

		Excepciones exc = new Excepciones();
		
		try
		{
			exc.lanzarException();
		}
		catch ( Exception e )
		{
			System.out.println( "Paso por el Catch" );
			System.out.println( e.getMessage() );
		}

		try
		{
		exc.lanzarRuntimeException();
		}
		catch ( Exception e )
		{
			System.out.println( "Paso por el Catch2" );
			System.out.println( e.getMessage() );
		}

		CalculadoraTest calcTest = new CalculadoraTest();
		calcTest.sumaNumeros();

	}

}
