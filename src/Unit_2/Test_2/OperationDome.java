package Unit_2.Test_2;

public class OperationDome {
    public static void main(String[] args) {
        int a = 25, b = 3;
        boolean d = a < b;
        System.out.println(a + "<" + b + "=" + d);
        int e = 3;
        d = (3 != 0 && a / e > 5);
        System.out.println(e + "!=0&&" + a + "/" + e + ">5=" + d);
        int f = 0;
        d = (f != 0 && a / f > 5);
        System.out.println(f + "!=0&&" + a + "/" + f + ">5=" + d);
        d = (f != 0 && a / f > 5);
        System.out.println(f + "!=0&&" + a + "/" + f + ">5=" + d);

    }
}
