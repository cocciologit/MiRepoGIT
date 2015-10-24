package ar.com.utn.prog_av1.practica;

public class exceptionZeroDivide extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3991851665504064198L;

	public exceptionZeroDivide() throws Exception
	{
		throw new Exception("No se puede dividir por cero");
	}

}
