package ar.com.utn.prog_av1.test;

//import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert;
import ar.com.utn.prog_av1.practica.OperacionesString;

public class OperacionesStringTest {
	
	
	@Test
	public void testImprimeUltimoCaracter()
	{
		OperacionesString opS = new OperacionesString();
		
		String ultCh = opS.imprimeUltimoCaracter( "HolaComoEstas?Y" );
		
		Assert.assertEquals("Y", ultCh);
	}

	@Test
	public void testReverseString()
	{
		OperacionesString opS = new OperacionesString();

		/*Imprimirlo en forma inversa.*/
		String inv = opS.reverseString( "cadena inversa" );
		
		Assert.assertEquals("asrevni anedac", inv);
	}
	
	@Test
	public void testImprimeCaracteresSeparados()
	{
		OperacionesString opS = new OperacionesString();

		/*Imprimir cada caracter del String separado con un guión.*/
		String res = opS.imprimeCaracteresSeparados( "caracteres separados" );

		Assert.assertEquals("c-a-r-a-c-t-e-r-e-s- -s-e-p-a-r-a-d-o-s-", res);
	}
	

	@Test
	public void testPoseeHola()
	{
		OperacionesString opS = new OperacionesString();

		/*Verifica si la cadena posee la palabra “hola” (indistintamente si posee letras mayúsculas o minúsculas)*/
		Boolean b = opS.poseeHola( "donde esta el hola?" );
		Assert.assertEquals(true, b);
	}



}
