package ar.com.utn.prog_av1.excepciones;


public class Excepciones {
	
	public void lanzarException () throws Exception
	{
		throw new Exception("mi excepcion1");
	}
	
	public void lanzarRuntimeException()
	{
		throw new RuntimeException("mi excepcion2");
	}

}
