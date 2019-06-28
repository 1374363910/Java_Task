package Unit_4.Test_1;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 3, 9, 1};
        int min = a[0], max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("最小值：" + min + "；" + "最大值：" + max);
    }
}
