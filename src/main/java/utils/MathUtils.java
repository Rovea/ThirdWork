package utils;

public class MathUtils {
    public long factorial(long number) {
        return number <= 1 ? 1 : number * factorial(number - 1);
    }
}
