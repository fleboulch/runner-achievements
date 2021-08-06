package com.flb.runnerachievements.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public class Distance {

    private final double value;
    private final DistanceUnit unit;

    public Distance(double value, DistanceUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Distance ofKilometer(double value) {
        return new Distance(value, DistanceUnit.KILOMETER);
    }
}
