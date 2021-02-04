public class Caja{
    private String nombre;
    private int peso;

    public Caja(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String toString(){
        return new String("Fruta: "+nombre+" "+"  Peso: "+peso+" kg");
    }
}