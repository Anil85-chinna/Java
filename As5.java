package Spack;

import java.util.Scanner;

public class As5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER STRING");
		String str1=sc.nextLine();
		char[] ar=str1.toCharArray();
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i] == ar[j]) {
					System.out.println(ar[j]);
					//break;
				}
				
			}
			
		}
	}

}
