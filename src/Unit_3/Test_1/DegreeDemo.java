package Unit_3.Test_1;

public class DegreeDemo {
    public static void main(String[] args) {
        int c = 38;
        switch (c < 10 ? 1 : c < 25 ? 2 : c < 35 ? 3 : 4) {
            case 1:
                System.out.println(" " + c + "℃ 有点冷，要多穿衣服。");
            case 2:
                System.out.println(" " + c + "℃ 正合适，出去玩吧。");
            case 3:
                System.out.println(" " + c + "℃ 有点热。");
            case 4:
                System.out.println(" " + c + "℃ 太热了！开空调。");
        }
    }
}
