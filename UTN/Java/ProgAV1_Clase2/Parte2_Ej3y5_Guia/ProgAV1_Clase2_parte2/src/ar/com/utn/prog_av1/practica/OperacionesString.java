package ar.com.utn.prog_av1.practica;

import javax.swing.text.StyleConstants.CharacterConstants;


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
		return cadena.substring(0, Integer.valueOf(cadena.length()) - ( Integer.valueOf(cadena.length()) / 2 ) );
	}
	
	/*Imprimir el último caracter.*/
	public String imprimeUltimoCaracter( String cadena )
	{
		return cadena.substring(cadena.length()-1, cadena.length());
	}

	/*Imprimirlo en forma inversa.*/
	public String reverseString( String cadena )
	{
		StringBuilder reverseStr = new StringBuilder();
		int j = 0;

		for ( j = cadena.length() ; j > 0 ; j-- )
		{
			reverseStr.append(cadena.charAt(j-1));
		}

		return reverseStr.toString();
	}
	
	/*Imprimir cada caracter del String separado con un guión.*/
	public String imprimeCaracteresSeparados( String cadena )
	{
		StringBuilder cadenaSeparada = new StringBuilder();
		int j = 0;

		for ( j = 0 ; j < cadena.length() ; j++ )
		{
			cadenaSeparada.append(cadena.charAt(j));
			cadenaSeparada.append("-");
		}

		return cadenaSeparada.toString();
	}
	
	/*Implementar un método que verifique si la cadena posee la palabra “hola” 
	  (indistintamente si posee letras mayúsculas o minúsculas)*/
	public boolean poseeHola( String cadena )
	{
		/*-1 si la cadena no es encontrada*/
		if ( cadena.toLowerCase().indexOf("hola") != -1 )
		{
			return true;
		}
		else
		{
			return false;
		}
	}


}
