package org.example.services;

import org.example.entities.Auction;
import org.example.entities.Client;

import java.util.List;

public interface Mediator {
    void add(Auction informant, List<Client> informed);

    void delete(Auction informant, List<Client> informed);

    void change(Auction informant);
}
