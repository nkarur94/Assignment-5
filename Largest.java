import java.util.Scanner;
class Largest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO COMPUTE THE GRETEST OF THREE NUMBERS");
		System.out.println("Enter the 1st number");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd number");
		int b=sc.nextInt();
		System.out.println("Enter the third number");
		int c=sc.nextInt();
		int max=(a>b)?((a>c)?a:c):((b>c)?b:c);//ternary operator
		System.out.println("GREATER::"+max);
	}
}
