package escuelitasomospnt;
public class Fruta extends Articulo {
    private final String unidadDeVenta;

    public Fruta(String nombre, int precio) {
        super(nombre, precio);
        this.unidadDeVenta = "kilo";
    }

    @Override
    public String toString() {
        return "Nombre: " +this.getNombre()+" /// Precio: $"+this.getPrecio()+ " /// Unidad de venta: " + unidadDeVenta;
    }

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }
}