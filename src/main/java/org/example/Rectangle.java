package org.example;

public class Rectangle {

    private double  width ;
    private double  length ;

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(double x , double y )
    {
        return x*y ;
    }
    public double getperamiter(double x , double y)
    {
        return (x+y) * 2 ;
    }
}
