package ar.com.utn.prog_av1.practica;


/*
 * Imprimir la cantidad de caracteres que posee.
 * Imprimir la primera mitad de los caracteres de la cadena. 
 * Imprimir el último caracter. 
 * Imprimirlo en forma inversa. 
 * Imprimir cada caracter del String separado con un guión.  
 * Implementar un método que verifique si la cadena posee la palabra “hola” (indistintamente si posee letras mayúsculas o minúsculas)
 */

public class OperacionesString {

	/*Imprimir la cantidad de caracteres que posee.*/
	public int getLength( String cadena )
	{
		return cadena.length();
	}
	
	/*Imprimir la primera mitad de los caracteres de la cadena.*/
	public String imprimirMitadString( String cadena )
	{
		return cadena.substring(0, Integer.valueOf(cadena.length()) );
	}
	
	/*Imprimir el último caracter.*/
	public String imprimeUltimoCaracter( String cadena )
	{
		return cadena.substring(cadena.length(), cadena.length());
	}

	/*Imprimirlo en forma inversa.*/
	public String reverseString( String cadena )
	{
		String reverseStr = new String();
		int j = 0;

		for ( j = cadena.length()-1 ; j > 0 ; j-- )
			reverseStr = reverseStr + cadena.charAt(j);

		return reverseStr;
	}
	
	/*Imprimir cada caracter del String separado con un guión.*/
	public String imprimeCaracteresSeparados( String cadena )
	{
		String cadenaSeparada = new String();
		int j = 0;

		for ( j = cadena.length()-1 ; j > 0 ; j-- )
			cadenaSeparada = cadenaSeparada + cadena.charAt(j) + "-";

		return cadenaSeparada;
	}
	
	/*Implementar un método que verifique si la cadena posee la palabra “hola” 
	  (indistintamente si posee letras mayúsculas o minúsculas)*/
	public boolean poseeHola( String cadena )
	{
		/*-1 si la cadena no es encontrada*/
		if ( cadena.toLowerCase().indexOf("hola") != -1 )
		{
			return false;
		}
		else
		{
			return true;
		}
	}


}
