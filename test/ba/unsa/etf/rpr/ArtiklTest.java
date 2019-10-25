package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;
import jdk.internal.jline.internal.TestAccessible;
import org.junit.jupiter.api.Test;
class ArtiklTest {
    @Test
    void setCijenaTest() {
        //kreiraj varijable

        //ixvrsi  metodu koju testiras

        //assert nad povrstnnnom vrijednosti

        Artikl a = new Artikl("biciklo", 100, "aaa");
        a.setCijena(120);
        assertEquals(120, a.getCijena());
    }


}