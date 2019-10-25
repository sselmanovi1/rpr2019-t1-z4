package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikliUSupermarketu = new Artikl[1000];

    public int getBrojArtikalaUSupermarketu() {
        return brojArtikalaUSupermarketu;
    }

    private int brojArtikalaUSupermarketu;

    public Supermarket() {
        brojArtikalaUSupermarketu = 0;
    }

    public void dodajArtikl(Artikl a){
        if(brojArtikalaUSupermarketu == 10000){
            System.out.println("U supermarketu se nalazi maksimalan broj artikala.");
        }
        else {
            artikliUSupermarketu[brojArtikalaUSupermarketu] = a;
            brojArtikalaUSupermarketu++;
        }
    }

    public Artikl[] getArtikli() {
        return this.artikliUSupermarketu;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(Artikl a : artikliUSupermarketu){
            if(a.getKod().equals(kod)){
                brojArtikalaUSupermarketu--;
                return a;
            }
        }
        return null;
    }
}
