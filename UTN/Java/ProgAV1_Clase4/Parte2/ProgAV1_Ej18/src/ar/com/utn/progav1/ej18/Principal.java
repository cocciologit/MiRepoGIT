package ar.com.utn.progav1.ej18;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		18.	Crear una clase llamada mi hilo que implemente la runnable. 
		En el método run creo un for de dos mil iteraciones que muestren por consola el 
		número de iteración y el nombre del hilo.
		Generar un test que cree 3 hilos, los ejecute y muestre un mensaje cuando 
		todos los hilos finalicen.
		*/
		
		Thread t = new Thread( new MiHilo() );
		
		t.start();
		
		

	}

}
