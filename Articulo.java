package escuelitasomospnt;
public abstract class Articulo implements Comparable<Articulo> {
    private String nombre;
    private int precio;

    public Articulo(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+" /// Precio: $"+precio;
    }
    
    @Override
    public int compareTo(Articulo articulo){
        final int MAYOR=1;
        final int IGUAL=0;
        final int MENOR=-1;
        if(this.precio > articulo.precio ){
            return MAYOR;
        }else if(this.precio == articulo.precio){
            return IGUAL;
        }else{
            return MENOR;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}