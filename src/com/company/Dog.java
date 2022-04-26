package com.company;

class Dog extends Animal {
    Dog (String name, String favoriteFood) {
        super(name, favoriteFood);
    }

    @Override
    public String manageSelf() {
        return "I am " + name + " and my favorite food is " + favoriteFood + "\nDJAAF";
    }
}