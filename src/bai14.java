import java.util.Scanner;
public class bai14 {
    public static void main(String[] args) {

        System.out.print("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i += 1) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println("Tổng các số tự nhiên không lớn hơn " + n + " và chia hết cho 7 là " + sum);
    }
}
