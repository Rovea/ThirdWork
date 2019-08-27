package service;

public class CoinObcersePossibility extends AnythingPossibility {

    private double possibility;

    public CoinObcersePossibility() {
        this.possibility = 0.5;
    }

    @Override
    public double getPossibility() {
        return this.possibility;
    }
}
