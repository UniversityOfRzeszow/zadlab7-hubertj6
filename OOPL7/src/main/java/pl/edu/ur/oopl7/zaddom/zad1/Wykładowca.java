package pl.edu.ur.oopl7.zaddom.zad1;

class Wykladowca extends Osoba {

    private String tytul;
   private String katedra;
    private String przedmiot;
    private String lubioblewac;

    public Wykladowca (String imie, String nazwisko, String data_urodzenia, String tytul, String katedra, String przedmiot, String lubioblewac){
        super(imie,nazwisko,data_urodzenia);
       this.tytul = tytul;
        this.katedra = katedra;
        this.przedmiot = przedmiot;
        this.lubioblewac= lubioblewac;
    }

   public String getTytul() {
       return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getKatedra() {
        return katedra;
    }

    public void setKatedra(String katedra) {
        this.katedra = katedra;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }
    public String getLubioblwac(){
    return lubioblewac;
    }
    public String setLubioblwać(String lubioblewac){
    return lubioblewac;
    }

    @Override
    public String toString() {
        return "Wykladowca\n" + super.toString() + "\ntytul: " + tytul + "\nkatedra: " + katedra + "\nprzedmiot: " + przedmiot +"\nLubioblewać" + lubioblewac;
    }
}