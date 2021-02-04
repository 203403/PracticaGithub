public class Pila{ 
	private Caja pila[];
	private int tope;
	
	public Pila(int capacidad){ 
		pila = new Caja[capacidad];
		tope = -1;
	} 
	
	public boolean isEmpty(){
		return tope == -1;
	}
	
	public void push(Caja i){
		if(tope+1 < pila.length)
			pila[++tope] = i;
	}
	public Caja pop(){
		if(isEmpty()){
            pila[tope+1]=null;
            return pila[tope+1];
        }
		return pila[tope--];
	}


	public Caja peek(){
		if(isEmpty()){
            pila[tope]=null;
            return pila[tope];
        }
		return pila[tope];
	}
	
}
	