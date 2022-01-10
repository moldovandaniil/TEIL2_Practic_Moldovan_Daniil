package com.company.controller;

import com.company.model.Produkte;

import java.util.List;
import java.util.Objects;

public class ProdukteController implements ProdukteControllerInterface {

    private final List<Produkte> produkteList;


    public ProdukteController(List<Produkte> produkteList, List<Produkte> produkteList1) {

        this.produkteList = produkteList1;
    }


    @Override
    public Produkte addProdukte(String name, Integer preis) {
        Produkte tempProdukte = new Produkte( name, preis);
        produkteList.add(tempProdukte);
        return tempProdukte;
    }

    @Override
    public void deleteProdukte(String name) {
        produkteList.removeIf(Produkte -> Objects.equals(Produkte.getName(), name));
    }

    @Override
    public void updateProdukte(String name, Integer preis) {
        for (Produkte Produkte:
                produkteList) {
            if(Objects.equals(Produkte.getName(), name)){
                Produkte.setName(name);
                Produkte.setPreis(preis);
            }
        }
    }

    @Override
    public List<Produkte> getAll() {
        return produkteList;
    }

    @Override
    public Produkte findById(String name) {
        for (Produkte Produkte:
                produkteList) {
            if(Objects.equals(Produkte.getName(), name))
                return Produkte;
        }
        return null;
    }
}
