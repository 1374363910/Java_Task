package Unit_3.Test_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpperOrLower {

    public void isUpperOrLower(char aChar) {
        if ((int) aChar > 64 && (int) aChar < 91) {
            System.out.println("是大写字母");
        } else if ((int) aChar > 96 && (int) aChar < 123) {
            System.out.println("是小写字母");
        } else {
            System.out.println("不是字母");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符：");
        String string = bufferedReader.readLine();
        UpperOrLower upperOrLower = new UpperOrLower();
        upperOrLower.isUpperOrLower(string.charAt(0));
    }
}
