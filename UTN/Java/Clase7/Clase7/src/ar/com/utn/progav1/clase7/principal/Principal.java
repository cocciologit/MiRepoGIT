package ar.com.utn.progav1.clase7.principal;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno alumno = new Alumno();

		alumno.setNombre("nombre");
		alumno.setApellido("apellido");
		alumno.setCarrera("carrera");
		alumno.setLegajo(1292592);
		
		Context contexto = new Context(alumno.getEstado());
		
		/**
		 * Transicion de estados:
		 * NULL -> Ingreso (Constructor)
		 * Ingreso -> ERegular
		 * ERegular -> Irregular
		 * Irergualr -> ERegular 
		 * ERegular -> Recibido
		 * Recibido -> Finalizado
		 * Finalizado -> ERegular
		 */
		
		/*Cambia de estado: Ingreso a ERegular*/
		contexto.handleIngreso(alumno);
		
		/*Cambia de estado: ERegular a Irregular*/
		contexto.handleEReguar(alumno);

		/*Cambia de estado: Irregular a ERegular*/
		contexto.handleIrregular(alumno);
		
		/*Cambia de estado: ERegular a Recibido*/
		contexto.handleARecibido(alumno);
		
		/*Cambia de estado: Recibido a Finalizado*/
		contexto.handleAFinalizado(alumno);
		
		/*Cambia de estado: Finalizado a ERegular*/
		contexto.handleFinalizadoAEReguar(alumno);

	}

}
