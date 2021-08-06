package com.flb.runnerachievements.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public class Run {

    private final String name;
    private final Distance distance;

    public Run(String name, Distance distance) {
        this.name = name;
        this.distance = distance;
    }
}
