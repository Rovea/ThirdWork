package service;

public class DiceIsTwoPossibility extends AnythingPossibility {

    private double possibility;

    public DiceIsTwoPossibility() {
        this.possibility = 1.0 / 6;
    }

    @Override
    public double getPossibility() {
        return this.possibility;
    }
}
