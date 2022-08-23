package Spack;

import java.util.Scanner;

public class As7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		int numOfVowels=0;
		int numOfConsonant=0;
		str.toLowerCase();
		//iterarting the string
		for(int i=0;i<str.length();i++) {
			//checking any one vowels
			if(str.charAt(i) =='a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				numOfVowels++;
			}
			//for only consonants expect nums and spl chars
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				//COUNTING REMAING
				
				numOfConsonant++;
			}
			
		}
		System.out.println("No of vowels "+numOfVowels);

		System.out.println("No of cons "+numOfConsonant);
		
		

	}

}
