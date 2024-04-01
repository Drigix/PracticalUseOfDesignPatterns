package org.example.entity.invoice;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Position {

	private String description;
	private int amount;
	private double price;
	private int vat;
	private String ku;


	public static class Builder {

		private String description;
		private int amount;
		private double price;
		private int vat;
		private String ku;

		public Builder (String description, int amount) {
			this.description = description;
			this.amount = amount;
		}

		public Builder description(String description) {
			this.description = description;
			return this;
		}

		public Builder amount(int amount) {
			this.amount = amount;
			return this;
		}

		public Builder price(double price) {
			this.price = price;
			return this;
		}

		public Builder vat(int vat) {
			this.vat = vat;
			return this;
		}

		public Builder ku(String ku) {
			this.ku = ku;
			return this;
		}

		public Position build() {
			return new Position(description, amount, price, vat, ku);
		}
	}
}
