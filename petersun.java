import java.util.*;
class petersun
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num=sc.nextInt();
		int fact;
		int sum=0;
		int n1=num;
		while(num>0)
		{
			int rm=num%10;
			fact=1;
			for(int i=rm; i>0; i--)
			{
				fact*=i;
			}
			sum+=fact;
			num/=10;
		}
		System.out.println(sum==n1 ? "Pitersun" : "Not Pitersun");
		sc.close();
    }
}