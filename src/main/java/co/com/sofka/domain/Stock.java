package co.com.sofka.domain;

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
        return misProductos.stream().filter(isTelevisor()).collect(Collectors.toList());
    }

    private Predicate<Producto> isTelevisor() {
        return producto -> producto instanceof Televisor;
    }

    public double calcularPrecioDeNeveras() {
        return calcularPrecios(misNeveras());
    }

    private List<Producto> misNeveras() {
        return misProductos.stream().filter(isNevera()).collect(Collectors.toList());
    }

    private Predicate<Producto> isNevera() {
        return producto -> producto instanceof Nevera;
    }

    public List<Producto> getMisProductos() {
        return misProductos;
    }

    public void setMisProductos(List<Producto> misProductos) {
        this.misProductos = misProductos;
    }
}
