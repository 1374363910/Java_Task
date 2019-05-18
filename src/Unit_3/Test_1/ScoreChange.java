package Unit_3.Test_1;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScoreChange {
    void grade(int score) {
        if (score / 10 == 9 || score == 100) {
            System.out.println("优秀");
        } else if (score / 10 == 8) {
            System.out.println("良");
        } else if (score / 10 == 7) {
            System.out.println("中");
        } else if (score / 10 == 6) {
            System.out.println("及格");
        } else if (score / 10 < 6 && score / 10 >= 0) {
            System.out.println("不及格");
        } else {
            System.out.println("输入有误");
        } 
    }

    public static void main(String[] args) {
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please input to data:");
        int s = 0;
        try {
            s = Integer.parseInt(strin.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        ScoreChange score1 = new ScoreChange();
        score1.grade(s);
    }
}
