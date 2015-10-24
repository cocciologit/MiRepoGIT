package ar.com.utn.progav1.reflection.tppag82.anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Defino el timepo de vigencia de la informacion de la anotacion y ella misma
@Retention(RetentionPolicy.RUNTIME)

//Defino sobre que elemento aplico la anotacion
@Target(ElementType.TYPE_USE)
public @interface Tabla {
	String nombre();

}
