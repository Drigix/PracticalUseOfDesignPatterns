package org.example;

import org.example.entity.invoice.Invoice;
import org.example.entity.invoice.Position;

public class TestInvoice {
public static void main(String[] args) {
//	Invoice faktura = Invoice.builder().build();
//	faktura.setContractor("Krzaczek Sp. z o.o.");
//	faktura.getPositions().add(new Position("komputer",1,1000));
//	faktura.getPositions().add(new Position("drukarka",2,300,23));
//	faktura.getPositions().add(new Position("myszka",2,23,23,""));
//	faktura.getPositions().add(new Position("montaz",1,300,7,"234"));
	Invoice fakturab = Invoice.builder().build();
	fakturab.setContractor("Krzaczek Sp. z o.o.");
	fakturab.getPositions().add(new Position.Builder("komputer",1).price(1000).build());
	fakturab.getPositions().add(new Position.Builder("drukarka",2).price(300).vat(23).build());
}


}
