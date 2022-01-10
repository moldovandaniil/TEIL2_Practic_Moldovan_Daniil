package com.company.controller;

import com.company.model.Bestellung;
import com.company.model.Produkte;

import java.util.List;

public interface BestellungControllerInterface {



        /**
         * Adds an Bestellung
         * @param bestellnr Integer
         * @param adresse String
         * @param produkteList List
         * @return produkte
         */
        Bestellung addBestellung(int bestellnr, String adresse, List<Produkte> produkteList);

        /**
         * Deletes an Bestellung
         * @param id Integer
         */
        void deleteBestellung(Integer id);

        /**
         * Updates an Bestellung
         * @param bestellnr Integer
         * @param adresse String
         * @param produkteList List
         */
        void updateBestellung(int bestellnr, String adresse, List<Produkte> produkteList);

        /**
         * Get all Bestellung
         */
        List<Bestellung> getAll();

        /**
         * Finds an Bestellung by a specified id
         * @param id Integer
         * @return Bestellung
         */
        Bestellung findById(Integer id);


        void sortNachPreis();

        void filterNachProdukt();
    }


