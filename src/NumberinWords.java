import java.util.Scanner;
public class NumberinWords {
    public static void main(String args[]) {
        System.out.println("Enter Number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num == 1)
            System.out.println("Unit");
        else if (num == 2)
            System.out.println("Ten");
        else if (num == 100)
            System.out.println("Hundred");
        else if (num == 1000)
            System.out.println("Thousand");
        else
            System.out.println("Other");
    }
}











