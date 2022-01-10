package com.company;

import com.company.controller.BestellungController;
import com.company.controller.BestellungControllerInterface;
import com.company.controller.ProdukteController;
import com.company.controller.ProdukteControllerInterface;
import com.company.view.View;

public class Main {

    public static void main(String[] args) {
        ProdukteControllerInterface produkteController = new ProdukteController();
        BestellungControllerInterface bestellungControlelr = new BestellungController();
	View view = new View(bestellungControlelr,produkteController);
    view.run();
    }
}
