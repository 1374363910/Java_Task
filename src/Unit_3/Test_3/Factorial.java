package Unit_3.Test_3;

public class Factorial {
    public static void main(String[] args) {
        long result = 1;
        for (int i = 2; i < 21; i++) {
            result *= i;
        }
        System.out.println("20的阶乘为：" + result);
    }
}
