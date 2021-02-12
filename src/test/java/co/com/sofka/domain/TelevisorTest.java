package co.com.sofka.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TelevisorTest {

    private Televisor televisor1, televisor2, televisor3, televisor4, televisor5, televisor6;

    @BeforeEach
    public void setUp() {
        televisor1 = new Televisor("A", "Nacional", 30, true);
        televisor2 = new Televisor("A", "Nacional", 40, true);
        televisor3 = new Televisor("A", "Nacional", 45, true);
        televisor4 = new Televisor("A", "Nacional", 30, false);
        televisor5 = new Televisor("A", "Nacional", 40, false);
        televisor6 = new Televisor("A", "Nacional", 45, false);
    }

    @Test
    public void precio() {
        assertEquals(950000, televisor1.precio());
        assertEquals(950000, televisor2.precio());
        assertEquals(1160000, televisor3.precio());
        assertEquals(700000, televisor4.precio());
        assertEquals(700000, televisor5.precio());
        assertEquals(910000, televisor6.precio());
    }

}
