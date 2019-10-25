package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikliUKorpi = new Artikl[50];

    public int getBrojArtikalaUKorpi() {
        return brojArtikalaUKorpi;
    }

    public void setBrojArtikalaUKorpi(int brojArtikalaUKorpi) {
        this.brojArtikalaUKorpi = brojArtikalaUKorpi;
    }

    private int brojArtikalaUKorpi;

    public Artikl[] getArtikliUKorpi() {
        return artikliUKorpi;
    }

    public void setArtikliUKorpi(Artikl[] artikliUKorpi) {
        this.artikliUKorpi = artikliUKorpi;
    }

    public Korpa() {
        this.brojArtikalaUKorpi = 0;
    }

    public boolean dodajArtikl(Artikl a) {
        //ako je uspjesno dodao artikl vratit ce true, a u suprotnom false
        if(this.brojArtikalaUKorpi == 50){
            return false;
        }
        else {
            this.artikliUKorpi[brojArtikalaUKorpi] = a;
            brojArtikalaUKorpi++;
        }
        return true;
    }

    public Artikl[] getArtikli() {
        return this.artikliUKorpi;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(Artikl a : artikliUKorpi){
            if(a.getKod().equals(kod)){
                brojArtikalaUKorpi--;
                return a;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int cijena = 0;
        for(Artikl a : artikliUKorpi)
            cijena += a.getCijena();

        return cijena;
    }
}
