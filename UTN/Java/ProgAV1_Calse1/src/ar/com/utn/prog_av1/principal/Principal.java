package ar.com.utn.prog_av1.principal;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String algo = new String("Hola");

		Persona p = new Persona();
		
		p.setNombre("pepe");
		p.setApellido("apellido");
		
		System.out.println(p.getNombre() + " " + p.getApellido());

		Persona p2 = new Persona("ignacio", "cocciolo");

		System.out.println(p2.getNombre() + " " + p2.getApellido());
		
		//System.out.println( p2.toString() );
		
		//Llama al metodo toString()
		System.out.println( p2 );
		
		//System.out.println( p2.ToString() );
		
		System.out.println(algo.toUpperCase());
		
		System.out.println(algo);
		
		//Aca vario el nombre de p3
		Persona p3 = new Persona("ignacuio", "cocciolo");
		
		//p3 = p2; //Si no hago esto, seran objetos diferentes.
		
		//Evalua si dos objetos son equivalentes.
		if ( p3.equals(p2) )
			System.out.println("p2 es igual a p3");
		else
			System.out.println("p2 NO es igual a p3");
		
		//Compara solo las referencias.
		if ( p3 == p2 )
			System.out.println("p2 es igual a p3");
		else
			System.out.println("p2 NO es igual a p3");

	}

}
