
import java.util.Scanner;

public class ex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        double d;
        String r;
        String s;
        //scanner.useDelimiter("/n");
        i = scanner.nextInt();
        d = scanner.nextDouble();
        s = scanner.nextLine();
        r = scanner.nextLine();

        // Write your code here.

        System.out.println("String: " + r);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}