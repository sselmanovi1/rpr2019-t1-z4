package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

import jdk.internal.jline.internal.TestAccessible;
import org.junit.jupiter.api.Test;


class KorpaTest {
    private Korpa korpa;
    private Artikl artikl;


    void setup(){
        Korpa korpa =new Korpa();
        Artikl artikl=new Artikl("biciklo",100,"ari");
    }
    @Test
    void izbacivanjeTest2(){
        korpa.dodajArtikl(artikl);
        Artikl izbacen=korpa.izbaciArtiklSaKodom("nepostojeciKod");
        assertNull(izbacen);
    }
    @Test
    void izbacivanjeTest1(){
        korpa.dodajArtikl(artikl);
        Artikl izbacen=korpa.izbaciArtiklSaKodom("1234");
        assertAll("izbacivanje",
                ()->assertEquals(artikl.getNaziv(),izbacen.getNaziv()),
                ()->assertEquals(artikl.getKod(),izbacen.getKod()),
                ()->assertEquals(artikl.getCijena(),izbacen.getCijena());

    }

@Test
void setCijenaTest() {
    Artikl a = new Artikl("biciklo", 100, "aaa");
    a.setCijena(120);
    assertEquals(120, a.getCijena());
}


}