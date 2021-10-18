import java.util.Scanner;
class VowelsConsonants{
		public static void main(String[] args){
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Alphabet to check its vowels or consonants");
		char alpa=sc.next().charAt(0);
		if (alpa=='a' || alpa=='e' || alpa=='i' || alpa=='o' || alpa=='u' || alpa=='A' || alpa=='E' || alpa=='I' || alpa=='O' || alpa=='U'){
			System.out.println("YOU HAVE ENTERED THE VOWEL");
		}
		else if((alpa>'a' && alpa<'z') || (alpa>'A' && alpa<'Z')){
			System.out.println("YOU HAVE ENTERED THE CONSONANTS");
		}
		else
			System.out.println("YOU HAVE NOT ENTERED ALPHABET");

	}
	
}

