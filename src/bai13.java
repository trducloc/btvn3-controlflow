import java.util.Scanner;
public class bai13 {
    public static void main(String[] args) {

        System.out.print("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s += 1.0 / i;
        }
        System.out.println("Tổng s=1+1/2+1/3+...+1/n là " + s);
    }
}
