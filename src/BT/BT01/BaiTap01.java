package BT.BT01;

import java.util.Scanner;

public class BaiTap01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập giá trị nhỏ nhất: ");
        int min = sc.nextInt();
        System.out.println("Nhập giá trị lớn nhất: ");
        int max = sc.nextInt();
        int sum = 0;

        if(min > max) {
            System.out.println("Giá trị nhỏ nhất lớn hơn giá trị lớn nhất!!! Xin hãy nhập lại");
            return;
        }

        for (int i = min; i <= max; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }

        System.out.printf("Tổng các số chẵn trong khoảng %d đến %d là: %d\n", min, max, sum);
    }
}
