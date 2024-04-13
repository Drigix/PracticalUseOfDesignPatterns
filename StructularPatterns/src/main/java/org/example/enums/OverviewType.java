package org.example.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OverviewType {
    NORMAL("Overview"), AIR_CONDITION("Overview with air condition"), DIESEL("Diesel overview");

    private final String type;
}
