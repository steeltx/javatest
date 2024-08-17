package org.example.javatest.player;

import java.util.Random;

public class Dice {

    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int roll(){
        // generar un numero aleatorio entre 0 y 5, se suma 1 para que sea 1-6
        return new Random().nextInt(sides) + 1;
    }

}
