package com.company;

abstract class Animal<String> {
    protected String name;
    protected String favoriteFood;

    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    public abstract String manageSelf();
}