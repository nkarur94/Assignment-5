import java.util.Scanner;
class Leap_year{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year to check it is the leap year or not");
		
		int year=sc.nextInt();
		int digY=String.valueOf(year).length();

		if (digY<4){
			System.out.println("Enter correct Year format");
		}
		else if(digY>4)
		{
			System.out.println("Enter correct Year format");
		}
		else{
			int leapYearCheck=year%4;
		
			if(leapYearCheck==0){
				System.out.println("Entered year is aleap year");
			}
			else
				System.out.println("Not a leap year");
		}
	}
}
