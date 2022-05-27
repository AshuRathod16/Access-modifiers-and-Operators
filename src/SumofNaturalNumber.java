import java.util.Scanner;
public class SumofNaturalNumber {
    public static void main(String args[]) {
        int Num = 1,n;
        long sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        while (Num <= n) {
            sum+= Num;
            ++Num;
        }
            System.out.println("Sum of natural number is:"  +sum);
        }
    }

