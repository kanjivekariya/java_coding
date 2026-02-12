import java.util.*;
class triangle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any no : ");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print(j<=(n-i)?"* ": "#  ");
			}
			System.out.println();
		}
		sc.close();
	}
}