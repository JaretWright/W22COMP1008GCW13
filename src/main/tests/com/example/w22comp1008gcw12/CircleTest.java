package com.example.w22comp1008gcw12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle("round",5);
    }

    @Test
    void setRadius() {
        circle.setRadius(6);
        assertEquals(6,circle.getRadius());
    }

    @Test
    void setRadiusSmall(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            circle.setRadius(0);
        });
    }
}