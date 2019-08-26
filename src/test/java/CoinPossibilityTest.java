import org.junit.Test;
import service.CoinPossibility;
import utils.MathUtils;

import static org.junit.Assert.assertEquals;

public class CoinPossibilityTest {

    @Test
    public void get_once_obcerse_possibility() {
        CoinPossibility coinPossibility = new CoinPossibility();
        double possibility = coinPossibility.getObcersePossibility();
        assertEquals("抛1次硬币正面朝上的可能性为50%", 0.5, possibility, 0.0);
    }

    @Test
    public void get_multi_all_obcerse_possibility() {
        CoinPossibility coinPossibility = new CoinPossibility();
        double possibility = coinPossibility.getMultiAllObcersePossibility(5);
        assertEquals("抛5次硬币都正面朝上的可能性为0.03125", 0.03125, possibility, 0.0);
    }

    @Test
    public void get_multi_anytimes_obcerse_possibility() {
        CoinPossibility coinPossibility = new CoinPossibility();
        double possibility = coinPossibility.getMultiAnyTimesObcersePossibility(5, 3);
        assertEquals("抛10次硬币,有5次正面朝上的可能性为0.03125", 5.0 / 16, possibility, 0.0);
    }

    @Test
    public void get_factorial_result() {
        MathUtils utils = new MathUtils();
        long result = utils.factorial(4);
        assertEquals("3的阶乘等于6", 24, result);
    }
}
