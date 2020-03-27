package ba.unsa.etf.rs.tut4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

public class Artikal {

    private String sifra;
    private String naziv;
    private double cijena;
    public static void izbaciDuplikate(ArrayList<Artikal> artikal){

    }

    public Artikal(String artikal) {
    String[] attribs = artikal.split(   ",");
    sifra = attribs[0];
    naziv = attribs[1];
    cijena = Double.parseDouble(attribs[2]);

    }
    public String getSifra() {
        return sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getCijena() {
        return cijena;
    }

    public void setSifra(String sifra) {

        if(sifra.isEmpty()){
            throw new IllegalArgumentException("Šifra je prazna!");
        }
        this.sifra = sifra;
    }

    public void setNaziv(String naziv) {

        this.naziv = naziv;
    }

    public void setCijena(double cijena) {

        if(cijena<0) {
            throw new IllegalArgumentException("Cijena je negativna!");
        }
        this.cijena = cijena;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artikal artikal = (Artikal) o;

        if (Double.compare(artikal.cijena, cijena) != 0) return false;
        if (sifra != null ? !sifra.equals(artikal.sifra) : artikal.sifra != null) return false;
        return naziv != null ? naziv.equals(artikal.naziv) : artikal.naziv == null;
    }


}
