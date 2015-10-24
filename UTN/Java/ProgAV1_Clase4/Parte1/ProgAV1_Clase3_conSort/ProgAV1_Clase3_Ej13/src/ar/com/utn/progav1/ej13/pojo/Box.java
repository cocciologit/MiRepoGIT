package ar.com.utn.progav1.ej13.pojo;

public class Box <T extends Number, T2 extends String > {
	
	private T objeto;
	private T2 objStr;
	
	public T2 getObjStr() {
		return objStr;
	}

	public void setObjStr(T2 objStr) {
		this.objStr = objStr;
	}

	public T getObjeto() {
		return this.objeto;
	}

	public void setObjeto( T tipo )
	{
		this.objeto = tipo;
	}

}
