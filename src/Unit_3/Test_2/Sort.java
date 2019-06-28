package Unit_3.Test_2;

import java.util.List;

public class Sort implements SortInterface {
    private int[] record;//定义待排序序列

    //构造函数，初始化序列
    private Sort(int[] record) {
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
        if (first >= end) {
        } else {
            int pivot = partition(first, end);
            quickSort(first, pivot - 1);
            quickSort(pivot + 1, end);
        }
    }

        private int partition(int first, int end) {
            int i = first, j = end, temp;
            while (i < j) {
                while (i < j && record[i] <= record[j]) {
                    j--;
                }
                if (i < j) {
                    temp = record[i];
                    record[i] = record[j];
                    record[j] = temp;
                    i++;
                }
                while (i < j && record[i] <= record[j]) {
                    i++;
                }
                if (i < j) {
                    temp = record[i];
                    record[i] = record[j];
                    record[j] = temp;
                    j--;
                }
            }
            return i;
        }


    @Override
    public void selectSort() {
        int index, temp;
        for (int i = 0; i < record.length; i++) {
            index = i;
            for (int scan = i + 1; scan < record.length; scan++) {
                if (record[index] > record[scan]) {
                    index = scan;
                }
            }
            if (index != i) {
                temp = record[i];
                record[i] = record[index];
                record[index] = temp;
            }
        }
    }

    @Override
    public void heapSort() {
        int temp;
        for (int index = record.length / 2 - 1; index >= 0; index--) {
            sift(index, record.length - 1);
        }
        for (int i = 1; i < record.length; i++) {
            temp = record[0];
            record[0] = record[record.length - i];
            record[record.length - i] = temp;
            sift(0,record.length-i-1);
        }
    }

        private void sift(int key, int last) {
            int temp;
            int siftNode = key;
            int max = 2 * siftNode + 1;
            while (max <= last) {
                if (max < last && record[max] < record[max + 1]) {
                    max++;
                }
                if (record[siftNode] > record[max]) {
                    break;
                } else {
                    temp = record[siftNode];
                    record[siftNode] = record[max];
                    record[max] = temp;
                    siftNode = max;
                    max = 2 * siftNode + 1;
                }
            }
        }

    @Override
    public void mergeSort1(int first, int last) {

    }

    @Override
    public void mergeSort2() {

    }

@Override
public void print() {
    for (int e : record) {
        System.out.print(e + " ");
    }
}

public static void main(String[] args) {
    int[] list = {10,3,9,4,11,13,5,2};
    Sort sort = new Sort(list);
    sort.insertSort();
    sort.print();
}
}
