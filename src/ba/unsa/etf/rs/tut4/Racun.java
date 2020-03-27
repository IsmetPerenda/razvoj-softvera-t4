package ba.unsa.etf.rs.tut4;

import java.util.ArrayList;

public class Racun {

     class StavkaRacuna{
        private ArrayList<Artikal> artikal;
        private Integer kolicina;

        public StavkaRacuna(ArrayList<Artikal> artikal, Integer kolicina) {
            this.artikal = artikal;
            this.kolicina = kolicina;
        }

         public StavkaRacuna(Artikal artikal, int i) {

         }

         public ArrayList<Artikal> getArtikli() {
            return artikal;
        }

        public void setArtikli(ArrayList<Artikal> artikli) {
            this.artikal = artikli;
        }

        public Integer getKolicina() {
            return kolicina;
        }

        public void setKolicina(Integer kolicina) {
            this.kolicina = kolicina;
        }
    }
    private ArrayList<StavkaRacuna> stavkaRacuna = new ArrayList<>();
    public void dodajStavku(Artikal artikal, int i){
    stavkaRacuna.add(new StavkaRacuna(artikal, i));

    }
    public double ukupanIznos(){
        double suma = 0;
        for (StavkaRacuna racuna : stavkaRacuna) {
            suma = suma + racuna.getKolicina();
        }
        return suma;
    }

    public void dodajStavku(){

    }
}

