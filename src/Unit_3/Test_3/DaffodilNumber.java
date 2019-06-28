package Unit_3.Test_3;

public class DaffodilNumber {
    private void DealNum(int i) {
        int a = i % 10;
        int b = i / 10 % 10;
        int c = i / 100;
        if (a * a * a + b * b * b + c * c * c == i) {
            System.out.println(i);
        }
    }

    public void ForDemo() {
        for (int i = 100; i < 1000; i++) {
            DealNum(i);
        }
    }

    public void WhileDemo() {
        int i = 100;
        while (i < 1000) {
            DealNum(i);
            i++;
        }
    }

    public void DoWhileDemo() {
        int i = 100;
        do {
            DealNum(i);
            i++;
        } while (i < 1000);
    }

    public static void main(String[] args) {
        DaffodilNumber daffodilNumber = new DaffodilNumber();
        daffodilNumber.ForDemo();
        System.out.println("----");
        daffodilNumber.WhileDemo();
        System.out.println("----");
        daffodilNumber.DoWhileDemo();
    }
}
