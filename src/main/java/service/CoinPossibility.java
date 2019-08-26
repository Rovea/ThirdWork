package service;

import utils.MathUtils;

public class CoinPossibility {

    private static final double OBCERSE_POSSIBILITY = 0.5;

    private static final double REVERSE_POSSIBILITY = 0.5;

    public double getObcersePossibility() {
        return OBCERSE_POSSIBILITY;
    }

    public double getReversePossibility() {
        return REVERSE_POSSIBILITY;
    }

    public double getMultiAllObcersePossibility(int tossTimes) {
        return Math.pow(OBCERSE_POSSIBILITY, tossTimes);
    }

    public double getMultiAnyTimesObcersePossibility(int tossTimes, int obcerseTimes) {
        MathUtils utils = new MathUtils();
        return (double) utils.factorial(tossTimes)
                / utils.factorial(obcerseTimes)
                / utils.factorial(tossTimes-obcerseTimes)
                / Math.pow(2, tossTimes);
    }
}
