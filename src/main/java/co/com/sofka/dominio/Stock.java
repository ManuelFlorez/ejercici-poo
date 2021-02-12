package co.com.sofka.dominio;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stock {

    private List<Producto> misProductos;

    public double calcularPrecioTodosLosProductos() {
        return calcularPrecios(misProductos);
    }

    private double calcularPrecios(List<Producto> productos) {
        double total = 0;
        for(Producto producto: productos)
            total += producto.precio();
        return total;
    }

    public double calcularPrecioDeTelevisores() {
        return calcularPrecios(misTelevisores());
    }

    private List<Producto> misTelevisores() {
        return misProductos.stream()
                .filter(soyTelevisor())
                .collect(Collectors.toList());
    }

    private Predicate<Producto> soyTelevisor() {
        return producto -> producto instanceof Televisor;
    }

    public double calcularPrecioDeNeveras() {
        return calcularPrecios(misNeveras());
    }

    private List<Producto> misNeveras() {
        return misProductos.stream()
                .filter(soyNevera())
                .collect(Collectors.toList());
    }

    private Predicate<Producto> soyNevera() {
        return producto -> producto instanceof Nevera;
    }

    public void setMisProductos(List<Producto> misProductos) {
        this.misProductos = misProductos;
    }

}
