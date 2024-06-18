import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tỷ giá USD là 22, mời nhập số tiền USD muốn chuyển đổi sang tiền việt: ");
        int money = scanner.nextInt() *22;
        System.out.println("Số tiền được chuyển đổi là: " + money);
    }
}
