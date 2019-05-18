package Unit_3.Test_2;

public interface SortInterface {
    public void insertSort();//插入排序
    public void shellSort();//希尔排序
    public void bubbleSort();//起泡排序
    public void quickSort(int first, int end);//快速排序
    public void selectSort();//选择排序
    public void heapSort();//堆排序
    public void mergeSort1(int first, int last);//归并排序递归算法
    public void mergeSort2();//归并排序非递归算法

    public void print();
}
