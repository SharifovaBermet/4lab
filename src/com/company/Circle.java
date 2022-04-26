package com.company;

class Circle extends Shape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

    public Double calculateArea() {
        return Math.PI*radius*radius;
    }
}