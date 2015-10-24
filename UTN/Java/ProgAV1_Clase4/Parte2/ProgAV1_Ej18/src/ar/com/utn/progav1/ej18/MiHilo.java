package ar.com.utn.progav1.ej18;

public class MiHilo implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for ( int i = 0 ; i < 2000 ; i++ )
		{
			System.out.println(i + " " + Thread.currentThread().toString());
		}
		System.out.println("Finalizo " + Thread.currentThread().toString() + " OK");
	}

}
