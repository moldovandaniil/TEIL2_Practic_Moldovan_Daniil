package com.company.model;

import java.util.List;

public class Bestellung {
    private int bestellNr;
    private String addresse;
    private List<Produkte> produkteList;


    public Bestellung(int bestellNr, String addresse, List<Produkte> produkteList) {
        this.bestellNr = bestellNr;
        this.addresse = addresse;
        this.produkteList = produkteList;
    }


    public int getBestellNr() {
        return bestellNr;
    }

    public void setBestellNr(int bestellNr) {
        this.bestellNr = bestellNr;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public List<Produkte> getProdukteList() {
        return produkteList;
    }

    public void setProdukteList(List<Produkte> produkteList) {
        this.produkteList = produkteList;
    }

    public int produkteSum(){
        int sum=0;
        for(Produkte produkte:produkteList){
            sum=sum+produkte.getPreis();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Bestellung{" +
                "bestellNr=" + bestellNr +
                ", addresse='" + addresse + '\'' +
                ", produkteList=" + produkteList +
                '}';
    }
}
