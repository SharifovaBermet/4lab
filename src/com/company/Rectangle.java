package com.company;

class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    public Double calculatePerimeter() {
        return 2*(height+width);
    }
    public Double calculateArea() {
        return height*width;
    }
}