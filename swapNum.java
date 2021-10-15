import java.util.Scanner;
class swapNum{
	public static void main(String[] args){
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number to swap");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("NUMBERS BEFORE SWAP:\nX::"+x+"\nY::"+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("NUMBERS AFTER SWAP:\nX::"+x+"\nY::"+y);
	}
}
