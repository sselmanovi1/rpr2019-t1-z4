package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;
import jdk.internal.jline.internal.TestAccessible;
import org.junit.jupiter.api.Test;

class SupermarketTest {
    @Test
 void IzbaciArtiklTest1(){
        Supermarket s= new Supermarket();
        s.dodajArtikl(new Artikl("sumeja",100,"sumka"));
        Artikl a=new Artikl("ema",100,"cuci");
        s.dodajArtikl(a);
        assertEquals(a,s.izbaciArtiklSaKodom("cuci"));

    }

}