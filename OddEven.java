import java.util.Scanner;
class OddEven{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num to check the give num is odd or even");
		int num=sc.nextInt();
		int numCheck=num%2;
		if (numCheck==0){
			System.out.println("Enter no is "+num+" is even number");
		}
		else System.out.println("Enter no is "+num+" is odd number");

	}
}
