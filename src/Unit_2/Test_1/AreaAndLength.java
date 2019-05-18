package Unit_2.Test_1;

public class AreaAndLength {
    public static void main(String[] args) {
        double length, area;
        Circle circle = null;
        Triangle triangle;
        Ladder ladder;
        circle = new Circle(2);
        triangle = new Triangle(2, 2, 3);
        ladder = new Ladder(2, 3, 2);
        length = circle.getLength();
        System.out.println("圆的周长：" + length);
        area = circle.getArea();
        System.out.println("圆的面积：" + area);
        length = triangle.getLength();
        System.out.println("三角形的周长：" + length);
        area = triangle.getArea();
        System.out.println("三角形的面积：" + area);
        area = ladder.getArea();
        System.out.println("梯形的面积：" + area);
        triangle.setABC(12, 34, 1);
        area = triangle.getArea();
        System.out.println("三角形的面积：" + area);
        length = triangle.getLength();
        System.out.println("三角形的周长：" + length);
    }
}

class Triangle {
    double sideA,sideB,sideC,area,length;
    boolean boo;

    public Triangle(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
        if (a + b > c && a + c > b && b + c > a) {
            this.boo = true;
        } else {
            this.boo = false;
        }
    }

    double getLength(){
        return length = sideA + sideB + sideC;
    }

    public double getArea() {
        if (boo) {
            double p = (sideA + sideB + sideC) / 2.0;
            area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
            return area;
        } else {
            System.out.println("不是一个三角形，不能计算面积");
            return 0;
        }
    }

    public void setABC(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
        if (a + b > c && a + c > b && b + c > a) {
            this.boo = true;
        } else {
            this.boo = false;
        }
    }
}

class Ladder {
    double above, bottom, height, area;

    Ladder(double a, double b, double c) {
        this.above = a;
        this.bottom = b;
        this.height = c;
    }

    double getArea() {
        return area = (above + bottom) * height / 2;
    }

}

class Circle {
    double radius, area;
    Circle(double r) {
        this.radius = r;
    }

    double getArea() {
        return area = Math.PI * Math.pow(radius, 2);
    }

    double getLength() {
        return Math.PI * radius * 2;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }

    double getRadius() {
        return radius;
    }
}

