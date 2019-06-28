package Unit_3.Test_3;

public class DegreeChangeDemo {
    public static void main(String[] args) {
        int h, c;
        System.out.println("摄氏温度\t华氏温度");
        for (c = 0; c <= 40; c += 5) {
            h = c * 9 / 5 + 32;
            System.out.println("\t" + c + "\t" + h);
        }
    }
}
