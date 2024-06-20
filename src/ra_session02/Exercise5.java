package ra_session02;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
        for (int j = 1; j <= 100; j++) {
            int i;
            for (i = 2; i < j; i++) {
                if (j%i==0) {
                    break;
                }
            }
            if (j == i) {
                System.out.println(j + " là số nguyên tố");
            } else {
                System.out.println(j + " không phải số nguyên tố");
            }
        }
    }
}
