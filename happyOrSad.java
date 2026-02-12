import java.util.*;
class happyOrSad
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num=sc.nextInt();
		int sum=0;
		do
		{
			int rm=num%10;
			
				sum+=rm*rm;
				if(sum==1){
					System.out.println("Happy number");
					break;
				}
				else
				{
					System.out.println("Sad number");
					break;
				}
			
		}while (num>0) ;
			sc.close();
		
	}
}