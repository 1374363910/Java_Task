package Unit_2.Test_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MySumDemo {
    public static void main(String[] args) throws IOException {
        int num1, num2, sum;
        String str;
        BufferedReader buf;
        buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input the first integer:");
        str = buf.readLine();
        num1 = Integer.parseInt(str);
        System.out.println("Input the second integer:");
        str = buf.readLine();
        num2 = Integer.parseInt(str);
        sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }
}
