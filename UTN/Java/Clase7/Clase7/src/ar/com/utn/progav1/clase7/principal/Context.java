package ar.com.utn.progav1.clase7.principal;

public class Context {
	
	private IEstado estado;

	public Context(IEstado estado) {
		//super();
		this.estado = estado;
	}
	
	public void handleIngreso(Alumno alumno)
	{
		this.estado.cambiarAERegular(alumno);
		//Asigno el nuevo estado al Context para que sepa en que estado esta el Alumno asi en el proximo cambio de estado sabe por que flujo ir.
		this.estado = alumno.getEstado();
	}
	
	public void handleEReguar(Alumno alumno)
	{
		this.estado.cambiarAIrregular(alumno);
		//Asigno el nuevo estado al Context para que sepa en que estado esta el Alumno asi en el proximo cambio de estado sabe por que flujo ir.
		this.estado = alumno.getEstado();
	}
	
	public void handleIrregular(Alumno alumno)
	{
		this.estado.cambiarAERegular(alumno);
		//Asigno el nuevo estado al Context para que sepa en que estado esta el Alumno asi en el proximo cambio de estado sabe por que flujo ir.
		this.estado = alumno.getEstado();
	}
	
	public void handleARecibido(Alumno alumno)
	{
		this.estado.cambiarARecibido(alumno);
		//Asigno el nuevo estado al Context para que sepa en que estado esta el Alumno asi en el proximo cambio de estado sabe por que flujo ir.
		this.estado = alumno.getEstado();
	}
	
	public void handleAFinalizado(Alumno alumno)
	{
		this.estado.cambiarAFinalizado(alumno);
		//Asigno el nuevo estado al Context para que sepa en que estado esta el Alumno asi en el proximo cambio de estado sabe por que flujo ir.
		this.estado = alumno.getEstado();
	}
	
	public void handleFinalizadoAEReguar(Alumno alumno)
	{
		this.estado.cambiarAERegular(alumno);
		//Asigno el nuevo estado al Context para que sepa en que estado esta el Alumno asi en el proximo cambio de estado sabe por que flujo ir.
		this.estado = alumno.getEstado();
	}

}
