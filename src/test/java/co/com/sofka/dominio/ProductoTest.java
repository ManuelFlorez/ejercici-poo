package co.com.sofka.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTest {

    private Producto miProducto1, miProducto2, miProducto3;

    @BeforeEach
    public void setUp() {
        miProducto1 = new Producto("A","Nacional");
        miProducto2 = new Producto("B", "Importado");
        miProducto3 = new Producto("C", "Importado");
    }

    @Test
    public void valorProcedencia() {
        assertEquals(250000, miProducto1.valorProcedencia());
        assertEquals(350000, miProducto2.valorProcedencia());
    }

    @Test
    public void valorConsumo() {
        assertEquals(450000, miProducto1.valorConsumo());
        assertEquals(350000, miProducto2.valorConsumo());
        assertEquals(250000, miProducto3.valorConsumo());
    }

    @Test
    public void precio() {
        assertEquals(700000, miProducto1.precio());
        assertEquals(700000, miProducto2.precio());
        assertEquals(600000, miProducto3.precio());
    }
}
