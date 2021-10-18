import java.util.Scanner;
class PowerOfTwo{

	public static void main(String[] args)
	{
		int powerTwo=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the power value");
		int power=sc.nextInt();
		if(power>0){
			for (int i=1; i<=power;i++){
			if (power>30){
				System.out.println("Enter power less den or equal to 30");	
				}
				else
					powerTwo=(int) Math.pow(2,i);
					System.out.println("2^"+i+"="+powerTwo);
			}
		}
		else
			System.out.println("Enter the power value greater then zero");
	}

}
