package Unit_3.Test_2;

public class Sort implements SortInterface {
    private int[] record;//定义待排序序列

    //构造函数，初始化序列
    public Sort(int[] record) {
        this.record = record;
    }
    @Override
    public void insertSort() {
        int temp, position;
        //排序进行length - 1趟
        for (int i = 1; i < record.length; i++) {//排序进行length - 1趟
            //暂存待插入记录
            temp = record[i];
            /*
            找到插入位置，如果temp<它前面的数值，则将前面的数值后移一位；
            然后继续跟再前一位数值对比，以此类推，结束循环后，将temp赋值
            给position位置
            */
            for (position = i; position-1 >= 0 && temp < record[position - 1]; position--) {
                record[position] = record[position - 1];
            }
            record[position] = temp;
        }
    }

    @Override
    public void shellSort() {
        int temp, position;
        for (int d = record.length / 2; d > 0; d /= 2) {
            for (int i = d; i < record.length; i++) {
                temp = record[i];
                for (position = i; position - d > 0 && temp < record[position - d]; position -= d) {
                    record[position] = record[position - d];
                }
                record[position] = temp;
            }
        }
    }

    @Override
    public void bubbleSort() {
        int exchange = record.length - 1;//第一趟排序区间record[0]~record[length-1]
        int position,bound, temp;
        while (exchange != 0) {//当上一趟排序有交换记录时
            bound = exchange;//
            exchange = 0;
            for (position = 0; position < bound; position++) {
                if (record[position] > record[position + 1]) {
                    temp = record[position];
                    record[position] = record[position + 1];
                    record[position + 1] = temp;
                    exchange = position;//记载每一次记录交换的位置
                }
            }
        }
    }

    @Override
    public void quickSort(int first, int end) {

    }

    @Override
    public void selectSort() {

    }

    @Override
    public void heapSort() {

    }

    @Override
    public void mergeSort1(int first, int last) {

    }

    @Override
    public void mergeSort2() {

    }

    @Override
    public void print() {

    }
}
