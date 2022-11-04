package tut2;

public class  Osoba {
    private
    String ime;
    String prezime;
    public
    Osoba(String ime, String prezime){
        this.ime=ime;
        this.prezime=prezime;
    }
    public String toString(){
        return ime+" "+prezime;
    };


}

