import java.util.*;
public class ASCII
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.pattern");
        System.out.println("2.exit");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            for( int i=1;i<=5;i++)
            {
                for( int j=1;j<=5;j++)
                {
                    System.out.print(i);
                }
                System.out.println();
            }
            break;
            case 2:
            int exit;
            exit=sc.nextInt();
            if(exit==2)
            {
                //close terminal window
            }else
            {
                //keep termianal window open
            }
            break;
        }
    }
}