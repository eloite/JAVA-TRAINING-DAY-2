public class GFG{


static void PrintReverseOrder(int N)
{
	

	if (N <= 0)
	{
		return;
	}
	else
	{
		System.out.print(N + " ");

	
		PrintReverseOrder(N - 1);
	}
}

public static void main(String[] args)
{
	int N = 100;

	PrintReverseOrder(N);
}
}

