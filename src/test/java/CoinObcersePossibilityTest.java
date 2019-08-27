import org.junit.Test;
import service.AnythingPossibility;
import service.CoinObcersePossibility;
import service.DiceIsTwoPossibility;

import static org.junit.Assert.assertEquals;

public class CoinObcersePossibilityTest {

    @Test
    public void get_coin_obcerse_possibility() {
        AnythingPossibility coinObcerse = new CoinObcersePossibility();
        double possibility = coinObcerse.getPossibility();
        assertEquals("抛1次硬币正面朝上的可能性为50%", 0.5, possibility, 0.0);
    }

    @Test
    public void get_dice_two_possibility() {
        AnythingPossibility coinObcerse = new DiceIsTwoPossibility();
        double possibility = coinObcerse.getPossibility();
        assertEquals("抛1次骰子出现2的可能性为1/6", 1.0 / 6, possibility, 0.0);
    }


}
