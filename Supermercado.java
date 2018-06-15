package escuelitasomospnt;

import java.util.ArrayList;
import java.util.Collections;

public class Supermercado {
    private ArrayList<Articulo>listaArticulos = new ArrayList();
    
    public void cargarArticulos(){
        listaArticulos.add(new Bebida(1.5, "Coca-Cola Zero",20));
        listaArticulos.add(new Bebida(1.5,"Coca-Cola",18));
        listaArticulos.add(new Shampoo(500,"Shampoo Sedal",19));
        listaArticulos.add(new Fruta("Frutillas",64));
    }
    public void mostrarArticulos(){
        this.getListaArticulos().forEach(System.out::println);
    }

    public ArrayList<Articulo> getListaArticulos() {
        return listaArticulos;
    }
    
    public void ordenarListaArticulos(){
        Collections.sort(listaArticulos);
    }
    public String mostrarArticuloMasBarato(){
        final int PRIMERO=0;
        return this.getListaArticulos().get(PRIMERO).getNombre();
    }
    
    public String mostrarArticuloMasCaro(){
        final int ULTIMO = this.getListaArticulos().size()-1;
        return this.getListaArticulos().get(ULTIMO).getNombre();
    }
}