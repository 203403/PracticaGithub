// void enqueue( String ) --> Inserta String
// String dequeue( )      --> Remueve y regresa el siguiente elemento
// String peek( )         --> Muestra el siguiente elemento sin alterar la estructura
// boolean isEmpty( )     --> true si est� vacia; false si tiene elementos
// int size()             --> Implementar: Cantidad de elementos en la estructura

public class MyQueueCaja {
	public static final int DEFAULT_SIZE=10;
	private Caja data[];
	private int index;

	public MyQueueCaja(){
		data=new Caja[DEFAULT_SIZE];
	}

	public MyQueueCaja(int s){
		data=new Caja[s];
	}
	
	public boolean isEmpty(){
		return index==0;
	}

	public void enqueue(Caja obj) throws Exception{
		if(index == data.length-1){
			throw new Exception("Queue is full. Dequeue some objects");
		}
		this.data[index]=obj;
		this.index++;
	}
	
	public Caja dequeue() throws Exception{
		if(isEmpty())throw new Exception("Queue is empty");
		Caja obj=this.data[0];
		for(int i =0; i<this.index-1; i++){
			data[i]=data[i+1];
		}
		this.index--;
		return obj;
	}
	
	public Caja peek() throws Exception{
		if(isEmpty())throw new Exception("Queue is empty");
			return this.data[0];
	}
	
}