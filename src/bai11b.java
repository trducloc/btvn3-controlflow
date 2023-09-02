import java.util.Scanner;
public class bai11b {
    public static void main(String[] args) {

        System.out.print("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        int chan = 0;
        int le = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                chan += i;
            } else {
                le += i;
            }
        }
        System.out.println("Tổng các số tự nhiên chẵn không lớn hơn " + n + " là " + chan);
        System.out.println("Tổng các số tự nhiên lẻ không lớn hơn " + n + " là " + le);
    }
}
