
import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        System.out.println("Final Marks");
        Scanner sc = new Scanner (System.in);
        System.out.println("English");
        int a =sc.nextInt();
        System.out.println("Math");
        int b =sc.nextInt();
        System.out.println("Bengali");
        int c = sc.nextInt();
        System.out.println("History");
        int d = sc.nextInt();
        System.out.println("Geography");
        int e = sc.nextInt();
        int percentage = (a+b+c+d+e)/5;
        System.out.println(percentage);
    }
}
