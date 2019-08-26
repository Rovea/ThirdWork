import service.CoinPossibility;

import java.util.Scanner;

public class DoCoinPossibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("投掷总次数：");
        int tossTimes = scanner.nextInt();
        System.out.print("正面朝上次数：");
        int obcerseTimes = scanner.nextInt();

        CoinPossibility coinPossibility = new CoinPossibility();
        System.out.println("概率为：" + coinPossibility.getMultiAnyTimesObcersePossibility(tossTimes, obcerseTimes));
    }
}
