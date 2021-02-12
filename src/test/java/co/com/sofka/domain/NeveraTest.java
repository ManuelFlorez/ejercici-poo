package co.com.sofka.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NeveraTest {

    private Nevera nevera1, nevera2, nevera3, nevera4, nevera5;

    @BeforeEach
    public void setUp() {
        this.nevera1 = new Nevera("A", "Nacional", 100);
        this.nevera2 = new Nevera("A", "Nacional", 120);
        this.nevera3 = new Nevera("A", "Nacional", 130);
        this.nevera4 = new Nevera("A", "Nacional", 140);
        this.nevera5 = new Nevera("A", "Nacional", 200);
    }

    @Test
    public void precio() {
        assertEquals(700000, nevera1.precio());
        assertEquals(700000, nevera2.precio());
        assertEquals(735000, nevera3.precio());
        assertEquals(770000, nevera4.precio());
        assertEquals(980000, nevera5.precio());
    }
}
