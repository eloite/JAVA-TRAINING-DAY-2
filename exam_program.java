import java.util.Scanner;
public class exam_program
{
    public static void main(String args[])
    {
        int com=0;
        String num;
        char ch;
        String str="";
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Frequency of vowels");
        System.out.println("2.Display the constants");
        com=sc.nextInt();
        System.out.println("Enter your word:");
        num=sc.next();
        switch(com)
        {
            case 1:
            for( int i=0;i<=0;i++)
            {
                ch = str.charAt(i);
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                {
                    System.out.print("l");
                }
                else
                {
                    System.out.println(ch);
                }
                System.out.println("The frequency of vowels are"+ch);
            }
            break;
        }
    }
}