package model;

import model.interfaces.Die;

import java.util.Random;

public class DieImpl implements Die {
    private int number;
    private int value;
    private int numberFaces;

    public DieImpl(int number, int value, int numberFaces) throws IllegalArgumentException {
        if (number < 1 || number > 2) {
            throw new IllegalArgumentException();
        } else if (value < 1 || value > numberFaces) {
            throw new IllegalArgumentException();
        } else if (numberFaces < 0) {
            throw new IllegalArgumentException();
        }

        this.number = number;
        this.value = value;
        this.numberFaces = numberFaces;
    }

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public int getNumFaces() {
        return this.numberFaces;
    }

    @Override
    public boolean equals(Die die) {
        return (die.getNumFaces() == this.getNumFaces() && die.getValue() == this.getValue());
    }
}
