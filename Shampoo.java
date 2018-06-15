package escuelitasomospnt;
public class Shampoo extends Articulo{
    private int contenido;

    public Shampoo(int contenido, String nombre, int precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " +this.getNombre()+ " /// Contenido: "+ contenido + "ml /// Precio: $"+this.getPrecio();
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }
}