package tut2;

import java.util.List;

public class Banka {
    protected
    Korisnik korisnici;
    Uposlenik uposlenici;
    public Banka(){};
    public Korisnik kreirajNovogKorisnika(String ime, String prezime){
        korisnici=new Korisnik(ime, prezime);
    return korisnici;}

        public Uposlenik kreirajNovogUposlenika(String ime, String prezime){

        uposlenici=new Uposlenik(ime,prezime);
        return uposlenici;
        }
        public Racun kreirajRacunZaKorisnika(Korisnik k){
        Racun racun=new Racun(k.racun.brojRacuna, k);
            return racun;
        }
    };

