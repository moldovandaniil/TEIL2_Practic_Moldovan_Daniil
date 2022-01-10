package com.company.assertTest;

import com.company.controller.BestellungController;
import com.company.controller.BestellungControllerInterface;
import com.company.controller.ProdukteController;
import com.company.controller.ProdukteControllerInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AssertTest {
    private BestellungControllerInterface bestellungController;
    private ProdukteControllerInterface produkteController;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        bestellungController = new BestellungController();
        produkteController = new ProdukteController();

        bestellungController.addBestellung(0, "asdasds", new ArrayList<>());
        bestellungController.addBestellung(1, "adasda", new ArrayList<>());

        produkteController.addProdukte("ap", 2);
        produkteController.addProdukte("dap", 3);

    }


}