package ar.com.utn.prog_av1.excepciones;

public class Calculadora {
	
	public int suma(int a, int b) throws Exception
	{
		if ( b == 0 )
		{
			throw new Exception("No puede ser CERO");
		}
		return a+b;
	}
	
	public int resta(int a, int b)
	{
		return a-b;
	}
	
	public int multiplica(int a, int b)
	{
		return a+b;
	}
	
	public int divide(int a, int b)
	{
		return a/b;
	}

}
