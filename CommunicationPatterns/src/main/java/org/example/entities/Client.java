package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.services.Mediator;

@AllArgsConstructor
@Getter
@Setter
public class Client {
    private String name;
    private double maxPrice;
    private Mediator mediator;

    public boolean checkIfClientResigns(double price) {
        System.out.println("Auction price has been change to: " + price);
        if(price > maxPrice) {
            System.out.println("Auction client: " + name + " giving up because price is too hight!");
            return true;
        }
        return false;
    }

}
