
import java.util.Scanner;

public class EXERCISE_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan  tu mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu "+(i+1)+": ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Tong cac phan tu trong mang la: " + sum);
        double avg=(double)sum/n;
        System.out.println("Trung binh cac phan tu trong mang la: " + avg);
    }
}
