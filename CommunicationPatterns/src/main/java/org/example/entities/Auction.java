package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.services.Mediator;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Auction {
    private double price;
//    private List<Client> clients = new ArrayList<>();
    private Mediator mediator;

    public void setPrice(double price) {
        this.price = price;
        System.out.println("Auction price: " + this.price);
        mediator.change(this);
    }
}
