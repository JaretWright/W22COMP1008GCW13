package com.example.w22comp1008gcw12;

public class Rectangle {
    private double width, height;

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width >0 )
            this.width = width;
        else
            throw new IllegalArgumentException("width must be greater than 0");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height>0)
            this.height = height;
        else
            throw new IllegalArgumentException("Height must be greater than 0");
    }

    public double getArea()
    {
        return height * width;
    }
}
