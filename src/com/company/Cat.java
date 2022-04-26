package com.company;

class Cat extends Animal {
    Cat (String name, String favoriteFood) {
        super(name, favoriteFood);
    }

    @Override
    public String manageSelf() {
        return "I am " + name + " and my favorite food is " + favoriteFood + "\nMEEOW";
    }
}