package ra_session02;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Số chia hết cho 3 và 5 trong khoảng từ 1-100:");
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}
