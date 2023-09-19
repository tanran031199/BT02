package BT.BT03;

import java.util.Scanner;

public class BaiTap03 {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.println(i + " là số nguyên tố");
            }
        }
    }
}
