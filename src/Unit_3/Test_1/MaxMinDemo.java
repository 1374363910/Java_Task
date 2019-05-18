package Unit_3.Test_1;

public class MaxMinDemo {
    public static void main(String[] args) {
        int max, a = 4, b = 3, c = 7;
        max = a > b ? a : b;
        max = max > c ? max : c;
        System.out.println(a+" "+b+" "+c);
        System.out.println("max=" + max);
    }
}
