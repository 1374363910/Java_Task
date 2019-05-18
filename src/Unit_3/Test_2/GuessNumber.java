package Unit_3.Test_2;

import javax.swing.*;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("给你一个1~100之间的整数，猜猜这个数");
        int realNumber = (int)(Math.random() * 100);
        int yourGuess = 0;
        String str = JOptionPane.showInputDialog("输入你的猜测：");
        yourGuess = Integer.parseInt(str);
        while (yourGuess != realNumber) {
            if (yourGuess > realNumber) {
                str = JOptionPane.showInputDialog("猜大了，再输入你的猜测：");
                yourGuess = Integer.parseInt(str);
            } else if (yourGuess < realNumber) {
                str = JOptionPane.showInputDialog("猜小了，再输入你的猜测：");
                yourGuess = Integer.parseInt(str);
            }
        }
        System.out.println("猜对了！");
    }
}
