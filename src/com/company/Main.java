package com.company;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        //Полиморфизм Задание 1
        MathOperation math = new MathOperation();
        System.out.println(math.add(2, 2));
        System.out.println(math.add(3, 3, 3));
        System.out.println(math.add(4, 4, 4, 4));

        //Полиморфизм Задание 2
        Shape rect = new Rectangle(4.0, 5.0);
        System.out.println("Периметр: " + rect.calculatePerimeter());
        System.out.println("Площадь: " + rect.calculateArea());
        Shape circle = new Circle(2.0);
        System.out.println("Периметр: " + circle.calculatePerimeter());
        System.out.println("Площадь: " + circle.calculateArea());

        //Полиморфизм Задание 3
        Animal cat = new Cat("Peter", "Whiskas");
        Animal dog = new Dog("Rocky", "Meat");
        System.out.println(cat.manageSelf());
        System.out.println(dog.manageSelf());

    }
}