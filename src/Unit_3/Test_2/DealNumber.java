package Unit_3.Test_2;

import java.util.Scanner;

public class DealNumber {
    private int number;

    //构造函数
    public DealNumber(int number) {
        //获取五位正整数
        if (number >= 0 && number <= 99999) {
            this.number = number;
        } else {
            System.out.println("输入数字不规范");
        }
    }

    //获取该数字位数
    public int getNumberOfDigits() {
        int i = 0;
        int aNumebr = number;
        while (aNumebr != 0) {
            aNumebr /= 10;
            i++;
        }
        return i;
    }

    //获取各个位数的数字
    public void printNumber() {
        String digits[] = new String[]{"个", "十", "百", "千", "万"};
        int aNumber = number;
        for (int i = 0; i < getNumberOfDigits(); i++) {
            int result = aNumber % 10;
            aNumber /= 10;
            System.out.println(digits[i] + "位数为：" + result);
        }
    }

    //获取逆序数字
    public void printInverse() {
        System.out.print("该数逆序为：");
        int aNumber = number;
        for (int i = 0; i < getNumberOfDigits(); i++) {
            int result = aNumber % 10;
            aNumber /= 10;
            System.out.print(result);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个不超过5位数的正整数：");
        int input = Integer.parseInt(scanner.next());
        DealNumber dealNumber = new DealNumber(input);
        System.out.println("该数位数为："+dealNumber.getNumberOfDigits());
        dealNumber.printNumber();
        dealNumber.printInverse();
    }
}
