package Lesson1.impl;

import Lesson1.Animal;
import Lesson1.Flyable;
import Lesson1.Illable;

public class Eagle extends Animal implements Flyable, Illable {
    @Override
    public void speak() {

    }

    @Override
    public void hunt() {

    }

    @Override
    public int getFlightSpeed() {
        return 100;
    }

    @Override
    public void getIll() {

    }
}
