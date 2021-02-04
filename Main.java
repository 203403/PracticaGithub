public class Main{
    	public static void main(String[] args) throws Exception {
		int contador=0;
		MyQueueCaja camion = new MyQueueCaja(21);
		MyQueueCaja almacen = new MyQueueCaja(21);
		Pila contenedor1 = new Pila(20);
		Pila contenedor2 = new Pila(20);
		Pila contenedor3 = new Pila(20);
		camion.enqueue(new Caja("Membrillo",7));
		camion.enqueue(new Caja("Fresa",11));
		camion.enqueue(new Caja("Membrillo",6));
		camion.enqueue(new Caja("Manzana",12));
		camion.enqueue(new Caja("Fresa",9));
		camion.enqueue(new Caja("Membrillo",5));
		camion.enqueue(new Caja("Manzana",11));
		camion.enqueue(new Caja("Membrillo",8));
		camion.enqueue(new Caja("Manzana",13));
		camion.enqueue(new Caja("Fresa",8));
		camion.enqueue(new Caja("Manzana",5));
		camion.enqueue(new Caja("Fresa",10));
		camion.enqueue(new Caja("Fresa",4));
		camion.enqueue(new Caja("Membrillo",6));
		camion.enqueue(new Caja("Manzana",9));
		camion.enqueue(new Caja("Membrillo",18));
		camion.enqueue(new Caja("Manzana",15));
		camion.enqueue(new Caja("Fresa",13));
		camion.enqueue(new Caja("Manzana",14));
		camion.enqueue(new Caja("Membrillo",11));
		System.out.println("Orden de llegada al almacen");
		while(!camion.isEmpty()){
			Caja cajas = camion.dequeue();
			System.out.println(cajas);
			almacen.enqueue(cajas);
		}
		System.out.println("\nClasificacion en el almacen");
		
		while(!almacen.isEmpty()){
			Caja contenido = almacen.dequeue();
			int peso = contenido.getPeso();
			String fruta = contenido.getNombre();	
			contador+=1;
			switch(fruta){
				case "Fresa":
					contenedor1.push(contenido);
				break;
				case "Manzana":
					contenedor2.push(contenido);
				break;
				case "Membrillo":
					contenedor3.push(contenido);
				break;
			}
			System.out.println("Caja "+contador+" de fruta tipo: "+fruta+"\t\tpeso de: "+peso+" kg\tSe almacena en el contenedor de: "+fruta+"s");	
		}
		System.out.println("\nMostrando el contenido de los Contenedores\nContenedor de Fresas");
		for(int i=0;i<20;i++){
			if (!contenedor1.isEmpty())
				System.out.println("Caja "+(i+1)+" "+contenedor1.pop());
		}
		System.out.println("Contenedor de Manzanas");
		for(int i=0;i<20;i++){
			if (!contenedor2.isEmpty())
				System.out.println("Caja "+(i+1)+" "+contenedor2.pop());
		}
		System.out.println("Contenedor de Membrillos");
		for(int i=0;i<20;i++){
			if (!contenedor3.isEmpty())
				System.out.println("Caja "+(i+1)+" "+contenedor3.pop());
		}
	}
}