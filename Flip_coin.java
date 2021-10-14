import java.util.Random;
import java.util.Scanner;
class Flip_coin{
	public static void main(String[] args)
	{
		int head=0;
		int tail=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of time u want to flip the coin");	
		int times=sc.nextInt();
		for(int i=0; i<times; i++)
		{
			Random r=new Random();
			int flipCall=r.nextInt(2);
			if(flipCall==0)
			{
				System.out.println("head");
				head++;
			}
			else
			{
				System.out.println("tail");
				tail++;
			}
		}
			System.out.println("no of head--"+head);
			System.out.println("no of tail--"+tail);
			//System.out.println("no of times"+times);
			float percentageOfHead=((head*100)/times);
			float percentageOfTail=((tail*100)/times);
			System.out.println("---------------------------");
			System.out.println("|percentage of head vs tail|");
			System.out.println("---------------------------");

			System.out.println(" head--"+percentageOfHead+"%\t tail--"+percentageOfTail+"%");
	

	}
}
