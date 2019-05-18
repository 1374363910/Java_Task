package Unit_2.Test_2;

import java.util.Scanner;

public class CircleArea {
    private double radius;
    private double area;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area = Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        CircleArea circleArea = new CircleArea();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入圆半径：");
        circleArea.setRadius(Double.parseDouble(scanner.next()));
        System.out.println("圆面积："+circleArea.getArea());
    }
}
