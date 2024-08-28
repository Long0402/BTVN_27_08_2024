package EXERCISE_1;

import java.util.Random;
import java.util.Scanner;

public class EXERCISE_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String check;
        do{
            System.out.println("Tiep tuc chuong trinh(yes or no)?");
            check = sc.nextLine();
            int n = rand.nextInt(100)+1;
            if(n%2==0)
            {
                System.out.println(n);
                System.out.println(n+" la so chan");
            }
            else System.out.println(n+" la so le");
        }while(check.equals("yes"));
    }
    
}
