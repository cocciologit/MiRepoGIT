package ar.com.utn.prog_av1.principal;

public class Persona {

	private String apellido;
	private String nombre;
	
	public Persona(){};

	public Persona(String apellido, String nombre) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return ( this.getNombre() + " " + this.getApellido() );
	}
	
	//Si no pongo @Override, seria un nuevo metodo si difiere al menos una letra. Si pongo @Override y hay alguna variacion, 
	//me arroja error.
	//@Override verifica si el metodo pertenece a una clase padre y si no es igual al de la superclase, da error.
	@Override
	public boolean equals(Object obj)
	{
		
		if ( obj.getClass().equals(this.getClass()) )
		{
			Persona pp = (Persona)obj;

/*			if (    this.getNombre().equals(pp.getNombre()) 
	 			 && this.getApellido().equals(pp.getApellido()) 
	 		   )
*/
			if ( this.hashCode() == pp.hashCode() )
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;

	}
	
	//REGLA: Si sobrescrivo equals, tambien el hashcode

	@Override
	public int hashCode()
	{
		int i = 3; //Es mejor poner un numero primo.

		i *= this.getApellido().hashCode();
		i *= this.getNombre().hashCode();
		
		
		

		return ( i );
	}

}
