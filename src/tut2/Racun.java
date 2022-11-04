package tut2;

public class Racun {
    Long brojRacuna;
    Osoba korisnikRacuna;
    boolean odobrenjePrekoracenja;
    Double stanjeRacuna=45.7;
    public Racun(Long novo, Osoba osoba){
        this.brojRacuna=novo;
        this.korisnikRacuna=osoba;
    };
    Double Stanje(){
        return stanjeRacuna;
    }
    private boolean provjeriOdobrenjePrekoracenja(Double iznos){
        if(odobrenjePrekoracenja==true)
            return true;
        else
            return false;
    };
    public boolean izvrsiUplatu(Double uplata){
        stanjeRacuna=stanjeRacuna+uplata;
            return true;
    }

    public boolean izvrsiIsplatu(Double isplata ){
        Double stanje=Stanje();
        if(provjeriOdobrenjePrekoracenja(isplata)==true){
            stanje=stanje-isplata;
        return true;}
        else
            return false;
    };
    public void odobriPrekoracenje(Double iznos){
        if(iznos<=100)
        odobrenjePrekoracenja=true;
    };




}
