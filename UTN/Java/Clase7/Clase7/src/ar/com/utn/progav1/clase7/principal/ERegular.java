package ar.com.utn.progav1.clase7.principal;

public class ERegular implements IEstado
{

	@Override
	public void cambiarAIngreso(Alumno alumno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cambiarAERegular(Alumno alumno) {
		// TODO Auto-generated method stub
		alumno.setEstado(new ERegular());
	}

	@Override
	public void cambiarAIrregular(Alumno alumno) {
		// TODO Auto-generated method stub
		alumno.setEstado(new Irregular());
		System.out.println("Cambio a estado Irregular");
	}

	@Override
	public void cambiarARecibido(Alumno alumno) {
		// TODO Auto-generated method stub
		alumno.setEstado(new Recibido());
		System.out.println("Cambio a estado Recibido");
	}

	@Override
	public void cambiarAFinalizado(Alumno alumno) {
		// TODO Auto-generated method stub
		
	}

}
