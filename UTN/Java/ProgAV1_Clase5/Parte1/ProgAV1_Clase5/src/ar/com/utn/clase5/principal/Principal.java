package ar.com.utn.clase5.principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
	
	public static void main(String[] args)
	{
		File f = new File("D:\\hola.txt");
		File f2 = new File("D:\\holas");
		
		try
		{
			if ( f.exists() == false )
				f.createNewFile();
			else
				f2.mkdir();
			
			if ( f.isFile() == true )
				System.out.println("Es un archivo");
	
			if ( f.isDirectory() == true )
				System.out.println("Es un directorio");
		}
		catch ( Exception e )
		{
			System.out.println( e.getMessage() );
		}
		
		/* try con recursos. Defino los recursos dentro del try y al finalizar 
		 * el try o salir por el catch, ejecuta el metodo close() automaticamente.*/
		try ( FileWriter fw = new FileWriter(f, true);
			  BufferedWriter bw = new BufferedWriter(fw); )
		{
			/*true -> Append - false -> crea el archivo*/
			//FileWriter fw = new FileWriter(f, true);

			/*Escribe en el buffer*/
			bw.write("Primer cadena del archivo\n");
			
			/*Vuelca el contenido del buffer en el archivo*/
			bw.flush();
		}
		catch ( IOException e )
		{
			System.out.println( e.getMessage() );
		}

		/* try con recursos. Defino los recursos dentro del try y al finalizar 
		 * el try o salir por el catch, ejecuta el metodo close() automaticamente.*/
		try ( FileReader fr = new FileReader(f);
			  BufferedReader br = new BufferedReader(fr); )
		{
			/*Lee del buffer*/
			String linea;
			while( ( linea = br.readLine() ) != null )
			{
				System.out.println(linea);
			}

		}
		catch ( IOException e )
		{
			System.out.println( e.getMessage() );
		}
		
		


	}

}
