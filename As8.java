package Spack;

import java.util.Scanner;

public class As8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER STRING WITH SPECIAL CHARS");
		String str1=sc.nextLine();
		int count=0;
		//converting string in to character array
		char[] arstr1=str1.toCharArray();
		//iterating the array
		for(int i=0;i<arstr1.length;i++){
			//in j we are storing ascii values.For that we are used type casting
			int j=(int) (arstr1[i]);
			//For small letters     For capital letters  For Numbers
			//AND is used for all condition must follow
			if(!(j>=48 && j<=57) && !(j>=65 && j<=90) && !(j>=97 && j<=122)) {
				count++;
				
			}
		
			}
		System.out.println(count);
			
			
		}
		

	}

	


