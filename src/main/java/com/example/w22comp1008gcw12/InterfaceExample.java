package com.example.w22comp1008gcw12;

import java.util.ArrayList;

public class InterfaceExample {
    public static void main(String[] args) {

        //simulate calculating the amount of paint required
        ArrayList<TwoDShape> walls = new ArrayList<>();

        walls.add(new Rectangle("wall 1", 10, 8));
        walls.add(new Rectangle("wall 2", 10, 8));
        walls.add(new Rectangle("wall 3", 15, 8));
        walls.add(new Rectangle("wall 4", 12, 8));
        walls.add(new Rectangle("ceiling", 15, 10));
        walls.add(new Rectangle("wall 5", 12, 8));
        walls.add(new Rectangle("wall 6", 12, 8));
        walls.add(new Rectangle("wall 7", 10, 8));
        walls.add(new Rectangle("wall 8", 10, 8));
        walls.add(new Rectangle("ceiling", 12, 10));
        walls.add(new Rectangle("North wall", 14, 8));
        walls.add(new Circle("oval office", 20));

        //your goal - calculate the total surface area in the room and type "done" in the group chat
        double totalSurface = 0;

        //type of object   temp variable name    collection we want to iterate over
        for (TwoDShape     wall                : walls)
        {
            totalSurface += wall.getArea();
        }



        System.out.printf("the total surface area is : %.0f%n",totalSurface);
        System.out.printf("We will require approximately %.0f",totalSurface/400);

    }
}
