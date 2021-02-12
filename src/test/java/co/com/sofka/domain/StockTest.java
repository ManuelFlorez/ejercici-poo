package co.com.sofka.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class StockTest {

    private Stock stock;

    @BeforeEach
    public void setUp() {
        List<Producto> misProductos = new LinkedList<Producto>();
        misProductos.add(new Producto("A", "Nacional"));
        misProductos.add(new Nevera("A", "Nacional", 240));
        misProductos.add(new Televisor("A", "Nacional", 45, true));
        stock = new Stock();
        stock.setMisProductos(misProductos);
    }

    @Test
    public void calcularPrecioTodosLosProductos() {
        assertEquals(2980000, stock.calcularPrecioTodosLosProductos());
    }

    @Test
    public void calcularPrecioDeNeveras() {
        assertEquals(1120000, stock.calcularPrecioDeNeveras());
    }

    @Test
    public void calcularPreciosDeTelevisores() {
        assertEquals(1160000, stock.calcularPrecioDeTelevisores());
    }
}
