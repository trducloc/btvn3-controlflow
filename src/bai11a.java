import java.util.Scanner;
public class bai11a {
    public static void main(String[] args) {

        System.out.print("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        int s = 0;

        for (int i = 1; i <= n; i++) {
            s += i;
        }
        System.out.println("Tổng các số tự nhiên không lớn hơn " + n + " là " + s);
    }
}
