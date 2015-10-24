package ar.com.utn.prog_av1.practica;

public class Principal {

	public static void main(String[] args) throws exceptionZeroDivide, Exception {
		// TODO Auto-generated method stub
		
		//Hacer de la guia EJ 3 y 5.
		
		Calculadora calc = new Calculadora();
		
		System.out.println(calc.sumar(1, 2));
		System.out.println(calc.restar(2, 3));
		System.out.println(calc.multiplicar(2, 0));
		
		try
		{
			System.out.println("div 1");
			System.out.println(calc.dividir(1, 2));
			System.out.println("div 2");
			System.out.println(calc.dividir(1, 0));
		}
		catch ( exceptionZeroDivide e )
		{
			System.out.println(" Error Exc1 " + e.getMessage());
		}
		catch ( Exception e )
		{
			System.out.println(" Error Exc2 " + e.getMessage());
		}
		
		/*Manejo de String*/
		OperacionesString opStr = new OperacionesString();
		
		System.out.println(opStr.reverseString("Hola"));
		System.out.println(opStr.imprimeCaracteresSeparados("caracteres separados"));
		System.out.println(opStr.imprimeUltimoCaracter("UltomoCaracterY"));
		System.out.println(opStr.imprimirMitadString("MitadDeString"));
		System.out.println(opStr.poseeHola("HOlA como estas?"));
		
		
		

	}

}
