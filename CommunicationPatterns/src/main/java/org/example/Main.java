package org.example;

import org.example.entities.Auction;
import org.example.entities.Client;
import org.example.services.Mediator;
import org.example.services.MediatorImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        Client c1 = new Client("Adam", 40);
//        Client c2 = new Client("Olek", 30);
//        List<Client> clients = new ArrayList<>();
//        clients.add(c1);
//        clients.add(c2);
//
//        Auction auction = new Auction(10, clients);
//
//        for(int i = 0; i < 200; i+=10) {
//            auction.setPrice(i);
//            System.out.println("Cena aukcji: " + auction.getPrice());
//            if(auction.getClients().stream().anyMatch(f -> f.getMaxPrice() < auction.getPrice())) {
//                List<Client> tempClients = auction.getClients().stream().filter(f -> f.getMaxPrice() < auction.getPrice()).toList();
//                for(Client client: tempClients) {
//                    Optional<Client> searchClient = auction.getClients().stream().filter(f -> f.getName().equals(client.getName())).findFirst();
//                    if(searchClient.isPresent()) {
//                        auction.getClients().remove(searchClient.get());
//                        System.out.println("Usuwam klienta: " + searchClient.get().getName() + "z aukcji");
//                    }
//                }
//            }
//        }

        Mediator mediator = new MediatorImpl();

        Client c1 = new Client("Adam", 40, mediator);
        Client c2 = new Client("Olek", 30, mediator);
        List<Client> clients = new ArrayList<>();
        clients.add(c1);
        clients.add(c2);

        Auction auction = new Auction(10, mediator);

        mediator.add(auction, clients);

        for(int i = 0; i < 200; i+=10) {
            auction.setPrice(i);
        }
    }
}