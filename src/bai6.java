import java.util.Scanner;
//// copy google
public class bai6 {
    public static void main(String[] args) {
        int p, s = 0; //p la so du. s la tong

        System.out.println("Nhập vào số nguyên dương bất kỳ: ");
        int n = new Scanner(System.in).nextInt();
        while (n > 0) {
            p = n % 10;
            n = n / 10;
            s += p;
        }
        System.out.println("Tổng các chữ số = " + s);
    }
}
