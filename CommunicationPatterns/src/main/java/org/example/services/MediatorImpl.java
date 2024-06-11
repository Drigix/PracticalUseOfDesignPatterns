package org.example.services;

import org.example.entities.Auction;
import org.example.entities.Client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MediatorImpl  implements Mediator {

    private Auction auction;
    private List<Client> clients;
    private Map<Auction, List<Client>> elements = new HashMap<>();

    @Override
    public void add(Auction informant, List<Client> informed) {
        elements.put(informant, informed);
    }

    @Override
    public void delete(Auction informant, List<Client> informed) {
        elements.remove(informant, informed);
    }

    @Override
    public void change(Auction informant) {
        List<Client> searchClients = elements.get(informant);
        List<Client> clientsToRemove = new ArrayList<>();
        for(Client client: searchClients) {
            if(client.checkIfClientResigns(informant.getPrice())) {
                clientsToRemove.add(client);
            }
        }
        searchClients.removeAll(clientsToRemove);
    }
}
