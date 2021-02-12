package co.com.sofka.dominio;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new LinkedList<Producto>();
        productos.add(new Producto("A", "Nacional"));
        productos.add(new Nevera("A", "Nacional", 240));
        productos.add(new Televisor("A", "Nacional", 45, true));

        Stock stock = new Stock();
        stock.setMisProductos(productos);

        System.out.println("total precio productos: " + stock.calcularPrecioTodosLosProductos());
        System.out.println("total precio Neveras: " + stock.calcularPrecioDeNeveras());
        System.out.println("total precio Televisores: " + stock.calcularPrecioDeTelevisores());
    }
}
