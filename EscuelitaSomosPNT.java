package escuelitasomospnt;
public class EscuelitaSomosPNT {
    public static void main(String[] args) {
        
        Supermercado supermercado = new Supermercado();
        supermercado.cargarArticulos();
        supermercado.mostrarArticulos();
        System.out.println("=================================================");
        supermercado.ordenarListaArticulos();
        System.out.println("Producto mas caro: "+supermercado.mostrarArticuloMasCaro());
        System.out.println("Producto mas barato: "+supermercado.mostrarArticuloMasBarato());   
    }
}
