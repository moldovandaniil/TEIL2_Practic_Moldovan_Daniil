package com.company.view;

import com.company.controller.BestellungControllerInterface;
import com.company.controller.ProdukteControllerInterface;
import com.company.model.Bestellung;
import com.company.model.Produkte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {

    private BestellungControllerInterface bestellungController;
    private ProdukteControllerInterface produkteController;

    public View(BestellungControllerInterface bestellungController,
                ProdukteControllerInterface produkteController ){
        this.bestellungController = bestellungController;
        this.produkteController = produkteController;

        Produkte banana = produkteController.addProdukte("banana", 2);
        Produkte mar = produkteController.addProdukte("mar", 4);
        Produkte cherry = produkteController.addProdukte("cherry", 3);

        List<Produkte> list1 = new ArrayList<>();
        list1.add(banana);
        list1.add(cherry);

        List<Produkte> list2 = new ArrayList<>();
        list2.add(mar);
        list2.add(cherry);

        bestellungController.addBestellung(1, "mandarinelor", list1);
        bestellungController.addBestellung(2, "cvard", list2);



    }

    public void run(){
        Scanner scanner = new Scanner(System.in);

        loop:
            while (true) {
                System.out.println("""
                     
                     0. Exit Program \r
                     1. Show all Products \r
                     2. Show all Bestellungs \r
                     3. Add a Product \r
                     4. Add an Bestellung \r
                     5. Remove a Product \r
                     6. Remove an Bestellung \r
                     7. Update a Product \r
                     8. Update an Bestellung \r
                     9. Sort Bestellungs by Preis \r
                     10. Filter Bestellungs by a certain Produkt \r
                    """);
                System.out.println("Enter input: ");
                int variant = scanner.nextInt();
                System.out.println("You've entered: " + variant);
                switch (variant) {
                    case 0:
                        break loop;
                    case 1:
                        showProducts();
                        break;
                    case 2:
                        showBestellungs();
                        break;
                    case 3:
                        addProducts();
                        break;
                    case 4:
                        addBestellungs();
                        break;
                    case 5:
                        deleteProduct();
                        break;
                    case 6:
                        deleteBestellung();
                        break;
                    case 7:
                        updateProduct();
                        break;
                    case 8:
                        updateBestellung();
                        break;
                    case 9:
                        sortByPreis();
                        break;
                    case 10:
                        filterByProdukt();
                        break;
                }

            }
        }


        private void showProducts(){
            System.out.println(produkteController.getAll());
        }

    private void showBestellungs() {
        System.out.println(bestellungController.getAll());
    }

    private void addProducts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You will need to write a few things that represent product attributes.");
        System.out.println("Enter Produkt name:");
        try {
            String name = scanner.nextLine();
            System.out.println("Enter Produkt Preis:");
            int preis = scanner.nextInt();

            produkteController.addProdukte(name, preis);
        } catch (Exception e) {
            throw e;
        }
    }

    private void addBestellungs() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You will need to write a few things that represent bestellung attributes.");
        System.out.println("Enter bestell nr:");
        try {
            int nr = scanner.nextInt();
            System.out.println("Enter Bestell Addresse:");
            scanner.nextLine(); //throw away the \n not consumed by nextInt()
            String address = scanner.nextLine();

            bestellungController.addBestellung(nr, address, new ArrayList<>());
        } catch (Exception e) {
            throw e;
        }
    }

    private void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name:");
        String id = scanner.nextLine();
        produkteController.deleteProdukte(id);
    }

    private void deleteBestellung() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Bestellung id:");
        int id = scanner.nextInt();
        bestellungController.deleteBestellung(id);
    }


    private void updateProduct() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You will need to write a few things that represent product attributes.");
            System.out.println("Enter product name:");
            String id = scanner.nextLine();
            System.out.println("Enter product preis:");
            int price = scanner.nextInt();
            scanner.nextLine();

            produkteController.updateProdukte(id, price);
        } catch (Exception e) {
            throw e;
        }
    }

    private void updateBestellung() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You will need to write a few things that represent bestellung attributes.");
            System.out.println("Enter bestellung id:");
            int id = scanner.nextInt();
            System.out.println("Enter bestellung street:");
            scanner.nextLine(); //throw away the \n not consumed by nextInt()
            String name = scanner.nextLine();


            bestellungController.updateBestellung(id,name,new ArrayList<>());
        } catch (Exception e) {
            throw e;
        }
    }


    private void sortByPreis(){
        bestellungController.sortNachPreis();
    }

    private void filterByProdukt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("You will need to write the product that we filter");
        String name = scanner.nextLine();
        bestellungController.filterNachProdukt(name);
    }



}





