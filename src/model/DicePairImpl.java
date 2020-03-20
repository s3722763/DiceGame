package model;

import model.interfaces.DicePair;
import model.interfaces.Die;

public class DicePairImpl implements DicePair {
    private Die die1;
    private Die die2;

    @Override
    public Die getDie1() {
        return die1;
    }

    @Override
    public Die getDie2() {
        return die2;
    }

    @Override
    public int getTotal() {
        return die1.getValue() + die2.getValue();
    }

    @Override
    public boolean equals(DicePair dicePair) {
        //Order enforced
        return dicePair.getDie1().equals(this.die1) && dicePair.getDie2().equals(this.die2);
    }

    @Override
    public int compareTo(DicePair dicePair) {
        if (this.getTotal() < dicePair.getTotal()) {
            return -1;
        } else if (this.getTotal() > dicePair.getTotal()) {
            return 1;
        } else {
            return 0;
        }
     }
}
