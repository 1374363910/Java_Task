package Unit_4.Test_1;

public class Fibonacci {
    public static void main(String[] args) {
        int[] f = new int[10];
        f[0] = f[1] = 1;
        for (int i = 2; i < 10; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        for (int e : f) {
            System.out.print(e + " ");
        }
    }
}
