package com.company.controller;

import com.company.model.Produkte;

import java.util.List;

public interface ProdukteControllerInterface {


    /**
     * Adds an Produkte
     * @param name String
     * @param preis Integer
     * @return Produkte
     */
    Produkte addProdukte(String name, Integer preis);

    /**
     * Deletes an Produkte
     * @param name String
     */
    void deleteProdukte(String name);

    /**
     * Updates an Produkte
     * @param name String
     * @param preis Integer
     */
    void updateProdukte(String name, Integer preis);

    /**
     * Get all Produkte
     */
    List<Produkte> getAll();

    /**
     * Finds an Produkte by a specified name
     * @param name String
     * @return Produkte
     */
    Produkte findById(String name);


}
