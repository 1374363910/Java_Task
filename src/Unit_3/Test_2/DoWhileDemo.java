package Unit_3.Test_2;

public class DoWhileDemo {
    public static void main(String[] args) {
        int limit = 100;
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        } while (i <= limit);
        System.out.println("sum = " + sum);
    }
}
