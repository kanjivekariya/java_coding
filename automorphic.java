import java.util.*;
class automorphic
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num=sc.nextInt();
		int length=0,div=1;
		while(num>0)
		{
			num/=10;
			length++;
		}	
		for(int i=1; i<length; i++)
		{
				div*=10;
				System.out.println(i+" "+div);
		}
		System.out.println((num*num)%(div)==num ? "automorphic" : "not automorphic");	
		sc.close();
	}
}