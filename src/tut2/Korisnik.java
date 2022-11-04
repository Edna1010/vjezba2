package tut2;

public class Korisnik extends Osoba {

    Racun racun;
    public Korisnik(String ime, String prezime) {
        super(ime,prezime);
    }
    public void DodajRacun(Racun r){
          racun=new Racun(r.brojRacuna, r.korisnikRacuna);
    };
}
