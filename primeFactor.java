import java.util.Scanner;
class primeFactor{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number greater then 1 to find the prime factor");
		int num=sc.nextInt();
		int i=2;
		while(num>1){
			if (num%i==0){
				System.out.print(i+",");
				num=num/i;
			}
			else
				i++;
		}
		
	}
}
