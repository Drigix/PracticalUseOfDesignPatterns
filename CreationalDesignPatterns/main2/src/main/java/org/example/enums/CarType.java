package org.example.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CarType {

    CAR("Car"), TRUCK("Truck");

    private final String type;
}
