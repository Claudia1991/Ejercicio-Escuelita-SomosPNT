package escuelitasomospnt;
public class Bebida extends Articulo {
    private double litros;

    public Bebida(double litros, String nombre, int precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: "+this.getNombre()+" /// Litros: "+litros+" /// Precio: $"+this.getPrecio();
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }
}