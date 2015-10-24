package ar.com.utn.progav1.reflection.tppag82.anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Defino el tiempo de vigencia
@Retention(RetentionPolicy.RUNTIME)

//Defino sobre que objeto puedo aplicar la anotacion
@Target(ElementType.METHOD)
public @interface Test2 
{

	//defino la cantida de veces q se ejecutara el metodo.
	//Simil firma de un metodo. Defino metadatos.
	int i();
	String nombre();




}
