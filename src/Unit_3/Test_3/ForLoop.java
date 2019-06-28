package Unit_3.Test_3;

public class ForLoop {
    public static void main(String[] args) {
        int limit = 100;
        int sum = 0;
        //下面这行代码利用for循环实现求和算法
        for (int i = 1; i <= limit; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
