package ar.com.utn.progav1.clase4.threads;

public class MetodosThread implements Runnable
{
	//public boolean flag = true;
	//Lo usaba para cambiarle el valor desde el main y frenar el hilo
	
	@Override
	public void run()
	{
		Thread t = Thread.currentThread();
		for ( int i = 0 ; i < 5 ; i++ )
		{
			System.out.println("" + i + " " + t.getName());
			/*Sleep por N milisegundos*/

				try {
					/*Si interrumpo un hilo dormido, lo mato igual y sale por excepcion*/
					Thread.sleep(2000L);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("Hilo " + Thread.currentThread().toString() + " interrumpido");
					return;
				}

				/* Si el hilo es interrumpido, salgo del mismo mientras que los demas 
			 * seguiran ejecutandose.
			 */
			if ( Thread.currentThread().isInterrupted() == true )
				return;
		}
	}

}
