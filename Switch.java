

public class Switch {
    public static void main(String[] args) {
        int num = 0;
        switch (num) {
            // case num == 10 -> System.out.println(num + "は10未満です"); //比較はできない
            case 10 -> System.out.println(num);
            default -> throw new RuntimeException("N/A");
        }
    }
}
