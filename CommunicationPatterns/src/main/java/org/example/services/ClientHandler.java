package org.example.services;

import lombok.AllArgsConstructor;
import org.example.entities.Client;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class ClientHandler extends ChainOfResponsibility {

    private List<Client> clients = new ArrayList<>();

    @Override
    public boolean handleEvent(ChainOfResponsibility event) {
        if(event instanceof ClientHandler) {
            return true;
        }
        return postEvent(event);
    }
}
