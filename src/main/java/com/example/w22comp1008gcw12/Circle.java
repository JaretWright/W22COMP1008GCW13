package com.example.w22comp1008gcw12;

public class Circle implements TwoDShape{
    private double radius;
    private String surfaceName;

    public Circle(String surfaceName, double radius) {
        setRadius(radius);
        setSurfaceName(surfaceName);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<= 0 || radius > 10)
            throw new IllegalArgumentException("radius must be greater than 0");
        else
            this.radius = radius;
    }

    public String getSurfaceName() {
        return surfaceName;
    }

    public void setSurfaceName(String surfaceName) {
        surfaceName = surfaceName.trim();
        if (surfaceName.length()>=4)
            this.surfaceName = surfaceName;
        else
            throw new IllegalArgumentException("surface name must have 4 or more characters");
    }


    @Override
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
}
