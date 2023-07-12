import java.util.Scanner;
public class checkpositiveornegative
{
   public static void main(String args[])
   {
       int num;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       num=sc.nextInt();
       if(num>0)
       {
           System.out.println(" the numberis positive");
       }
       else if(num<0)
       {
           System.out.println("The number is negative");
       }
       else
       {
           System.out.println("The number is 0");
       }
   }
}