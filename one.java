public class one
{
    int a=3;
}
public class two extends one
{
    int b=4;
}
public class three extends two
{
    int c=5;
    public static void main(String args[])
    {
        three o=new three();
        System.out.println(o.a+o.b+o.c);
    }
}