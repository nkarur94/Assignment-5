import java.util.Scanner;
class QuotientRemainder{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number to find Quotient and Remainder");
		int num=sc.nextInt();
		int div=sc.nextInt();
		int quot=num/div;
		int rem=num%div;
		System.out.println("YOU ENTERED "+num+"/"+div);
		System.out.println("QUOTIENT="+quot);
		System.out.println("REMAINDER="+rem);
	}
}
