package com.example.w22comp1008gcw12;

public class Rectangle {
    private double width, height;
    private String surfaceName;

    public Rectangle(String surfaceName, double width, double height) {
        setWidth(width);
        setHeight(height);
        setSurfaceName(surfaceName);
    }

    public String getSurfaceName() {
        return surfaceName;
    }

    public void setSurfaceName(String surfaceName) {
        surfaceName = surfaceName.trim();
        if (surfaceName.length()>=4)
            this.surfaceName = surfaceName;
        else
            throw new IllegalArgumentException("surface name must be 4 or more characters");
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
