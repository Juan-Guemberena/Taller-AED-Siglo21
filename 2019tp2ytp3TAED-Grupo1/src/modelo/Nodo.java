package modelo;

public class Nodo {

	private Object dato; 
	private Nodo sig; 
	
	//Constructor con 1 argumento.
	public Nodo(Object dato) {
		
		this.dato = dato;
		this.sig = null;
	}//Fin constructor.
	
	public Nodo() {
		this.dato = null;
		this.sig = null;
	}

	//Obtiene el dato del nodo
	public Object getDato() {
		return dato;
	}//Fin m�todo getDato.
	
	//Establece el dato del nodo.
	public void setDato(Object dato) {
		this.dato = dato;
	}//Fin m�todo setDato.
	
	//Obtiene el nodo siguiente.
	public Nodo getSig() {
		return sig;
	}//Fin m�todo getSig.
	
	//Establece el nodo siguiente.
	public void setSig(Nodo sig) {
		this.sig = sig;
	}//Fin m�todo setSig.
	
}//Fin clase Nodo.
