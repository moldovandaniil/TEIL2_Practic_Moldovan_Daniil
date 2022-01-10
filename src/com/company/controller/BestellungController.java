package com.company.controller;

import com.company.model.Bestellung;
import com.company.model.Produkte;

import java.util.List;
import java.util.Objects;

public class BestellungController implements BestellungControllerInterface{


    private List<Bestellung> bestellungList;

    public BestellungController(List<Bestellung> bestellungList) {
        this.bestellungList = bestellungList;
    }

    @Override
    public Bestellung addBestellung(int bestellnr, String adresse, List<Produkte> produkteList) {
        Bestellung tempBestellung = new Bestellung(bestellnr,adresse,produkteList);
        bestellungList.add(tempBestellung);
        return tempBestellung;
    }

    @Override
    public void deleteBestellung(Integer id) {
        bestellungList.removeIf(Produkte -> Objects.equals(Produkte.getBestellNr(), id));
    }

    @Override
    public void updateBestellung(int bestellnr, String adresse, List<Produkte> produkteList) {
        for (Bestellung bestellung:
                bestellungList) {
            if(Objects.equals(bestellung.getBestellNr(), bestellnr)){
                bestellung.setAddresse(adresse);
                bestellung.setProdukteList(produkteList);
            }
        }
    }

    @Override
    public List<Bestellung> getAll() {
        return bestellungList;
    }

    @Override
    public Bestellung findById(Integer id) {
        for (Bestellung bestellung:
                bestellungList) {
            if(Objects.equals(bestellung.getBestellNr(), id))
                return bestellung;
        }
        return null;
    }

    @Override
    public void sortNachPreis() {
        bestellungList.stream().sorted()
    }

    @Override
    public void filterNachProdukt() {

    }


}

