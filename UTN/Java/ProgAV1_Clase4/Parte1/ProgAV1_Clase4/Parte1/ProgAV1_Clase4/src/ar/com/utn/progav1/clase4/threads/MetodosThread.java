package ar.com.utn.progav1.clase4.threads;

public class MetodosThread implements Runnable
{
	
	@Override
	public void run()
	{
		Thread t = Thread.currentThread();
		for ( int i = 0 ; i < 5 ; i++ )
		{
			System.out.println("" + i + " " + t.getName());
		}
	}

}
