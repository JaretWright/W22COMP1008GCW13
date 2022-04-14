package com.example.w22comp1008gcw12;

import java.util.ArrayList;

public class InterfaceExample {
    public static void main(String[] args) {

        //simulate calculating the amount of paint required
        ArrayList<Rectangle> walls = new ArrayList<>();

        walls.add(new Rectangle("wall 1", 10, 8));
        walls.add(new Rectangle("wall 2", 10, 8));
        walls.add(new Rectangle("wall 3", 15, 8));
        walls.add(new Rectangle("wall 4", 12, 8));
        walls.add(new Rectangle("ceiling", 15, 10));
        walls.add(new Rectangle("wall 1", 12, 8));
        walls.add(new Rectangle("wall 2", 12, 8));
        walls.add(new Rectangle("wall 3", 10, 8));
        walls.add(new Rectangle("wall 4", 10, 8));
        walls.add(new Rectangle("ceiling", 12, 10));
        walls.add(new Rectangle("North wall", 14, 8));

        //your goal - calculate the total surface area in the room and type "done" in the group chat
        double totalSurface = 0;
        for (Rectangle rectangle : walls)
            totalSurface += rectangle.getArea();

        System.out.println("the total surface area is : "+totalSurface);
    }
}
