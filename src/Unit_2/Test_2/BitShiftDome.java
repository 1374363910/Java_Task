package Unit_2.Test_2;

public class BitShiftDome {
    public static void main(String[] args) {
        int a = -16, b = 16;
        System.out.println("****************************");
        System.out.println("a的二进制数为：" + Integer.toBinaryString(a));
        System.out.println("a左移1位后各位为：" + (a << 1));
        System.out.println(a + "<< 2 =" + (a << 2));

        System.out.println("****************************");
        System.out.println("a的二进制数为：" + Integer.toBinaryString(a));
        System.out.println("a右移1位后各位为：" + (a >> 1));
        System.out.println(a + ">> 2 =" + (a >> 2));

        System.out.println("****************************");
        System.out.println("a的二进制数为：" + Integer.toBinaryString(a));
        System.out.println("a右移1位后各位为：" + (a >> 1));
        System.out.println(a + "a无符号右移2位" + (a >>> 2));

        System.out.println("****************************");
        System.out.println("b的二进制数为：" + Integer.toBinaryString(b));
        System.out.println("b左移1位后各位为：" + (b << 1));
        System.out.println(b + "<< 2 =" + (b << 2));

        System.out.println("****************************");
        System.out.println("b的二进制数为：" + Integer.toBinaryString(b));
        System.out.println("b右移1位后各位为：" + (b >> 1));
        System.out.println("b右移2位后各位为：" + (b >> 2));

        System.out.println("****************************");
        System.out.println("b的二进制数为：" + Integer.toBinaryString(b));
        System.out.println("b右移1位后各位为：" + (b >> 1));
        System.out.println("b无符号右移2位后各位为：" + (b >>> 2));
        System.out.println("****************************");

    }
}
