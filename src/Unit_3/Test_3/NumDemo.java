package Unit_3.Test_3;

public class NumDemo {
    public static void main(String[] args) {
        int n;
        System.out.println("在1~1000可被3与5整除的为");
        for (n = 0; n <= 1000; n++) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println(n);
            }
        }
        System.out.println(" ");
    }
}
