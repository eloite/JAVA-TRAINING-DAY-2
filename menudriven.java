import java.util.Scanner;
public class menudriven
{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("1.FRUITS");
        System.out.println("2.CAKE");
        System.out.println("Enter your choice:");
        num=sc.nextInt();
        switch(num)
        {
            case 1:
            System.out.println("1.kewi");
            System.out.println("2.puppaya");
            System.out.println("3.pomegranite");
            System.out.println("4.chiko");
            System.out.println("5.orange");
            num=sc.nextInt();
            break;
            case 2:
            System.out.println("1.black forest");
            System.out.println("2.white forest");
            System.out.println("3.chocolate");
            System.out.println("4.butterscotch");
            System.out.println("5.vanilla");
            num=sc.nextInt();
            break;
        }
        System.out.println("The cost is 189");
    }
    
}