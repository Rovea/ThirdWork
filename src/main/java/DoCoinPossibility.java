import service.AnythingPossibility;
import service.CoinObcersePossibility;
import service.DiceIsTwoPossibility;

public class DoCoinPossibility {
    public static void main(String[] args) {

        AnythingPossibility diceIsTwo = new DiceIsTwoPossibility();
        AnythingPossibility coinObcerse = new CoinObcersePossibility();

        double diceIsTwoPos = diceIsTwo.getPossibility();
        double coinObcersePos = coinObcerse.getPossibility();

        System.out.println("硬币朝上的概率为：" + coinObcersePos);
        System.out.println("骰子为2的概率为：" + diceIsTwoPos);
    }
}
