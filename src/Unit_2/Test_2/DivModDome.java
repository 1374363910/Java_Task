package Unit_2.Test_2;

public class DivModDome {
    public static void main(String[] args) {
        /*
        * different variable
        * */
        int a = 8, b = 5;

        //演示除法运算关系
        System.out.println(a + "/" + b + "=" + a / b);
        System.out.println(a + "/" + (-b) + "=" + a / -b);
        System.out.println(-a + "/" + b + "=" + -a / b);
        System.out.println(-a + "/" + (-b) + "=" + -a / -b);

        //演示取模运算关系
        System.out.println(a + "%" + b + "=" + a % b);
        System.out.println(a + "%" + (-b) + "=" + a % -b);
        System.out.println(-a + "%" + b + "=" + -a % b);
        System.out.println(-a + "%" + (-b) + "=" + -a % -b);

        //演示自加运算关系
        //System.out.println(++a + "/" + b + "=" ++ +a / b);
        System.out.println(++a + "/" + b + "=" + (++a) / b);
        System.out.println(a++ + "/" + (-b) + "=" + a++ / -b);
        System.out.println(- ++a + "/" + b + "=" + - ++a / b);
        System.out.println(-a++ + "/" + (-b) + "=" + -a++ / -b);

    }
}
