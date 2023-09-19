package BT.BT04;

public class BaiTap04 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                if (count > 20) {
                    break;
                }
                System.out.println(i + " là số nguyên tố");
            }
        }
    }
}
