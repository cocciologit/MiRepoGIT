package ar.com.utn.progav1.clase4.threads;

public class Principal 
{
	public static void main(String[] args) throws InterruptedException
	{

		Thread t = new Thread( new MetodosThread(), "Hilo_t1" );
		t.setPriority(1);
		t.start(); /*ejecuta el metodo run() de mi clase MetodosThread si extiende de Thread
		 			 o si implementa Runnable*/
		
		/*Esta linea la ejecuta el main => retorna main()*/
		Thread t3 = Thread.currentThread();
		System.out.println(t3.getName());

		/*No puedo re-ejecutar t ya que cuando termina el Thread t, se destruye el hilo.
		  Debo reinstanciar el Thread*/
		/*Si hago t.run() ejecuto un metodo normal de un hilo, pero no un hilo*/
		
		System.out.println(t.isAlive());
		
		System.out.println("Termino la ejecucion de t");
		
		Thread t2 = new Thread( new MetodosThread(), "Hilo_t2" );
		t2.setPriority(10);
	
		Thread t8 = new Thread( new MetodosThread(), "Hilo_t8" );
		t8.setPriority(9);

		t8.start();
		t2.start();

		
		/*Reutilizo un thread ya existente*/
		Thread t4 = new Thread( new MetodosThread(), "Hilo_t3" );
		Thread t5 = new Thread( t4, "Hilo_t4" );
		Thread t6 = new Thread( t5, "Hilo_t5" );
		Thread t7 = new Thread( t6, "Hilo_t6" );
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		

	}
	
	
	
}
