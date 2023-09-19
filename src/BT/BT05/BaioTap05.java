package BT.BT05;

public class BaioTap05 {
    public static void main(String[] args) {
        int n = 1;
        boolean flag = true;

        while(flag) {
            n++;
            if(n % 5 == 0 && n % 7 == 0 && n % 11 == 0) {
                System.out.println(n + " là số nhỏ nhất chia hết cho 5, 7 và 11");
                flag = false;
            }
        }
    }
}
