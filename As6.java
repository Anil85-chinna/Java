package Spack;

import java.util.Arrays;
import java.util.Scanner;

public class As6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//USING SORTING
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER STRING");
		System.out.println("using sort()");
		String str1=sc.nextLine();
		//we are using chararray
		char[] arr=str1.toCharArray();
	    Arrays.sort(arr);
		System.out.println(arr);
		System.out.println("now without sort()");
		String str2=sc.nextLine();
		char temp = 0;
		char[] arr1=str2.toCharArray();
		for(int i=0;i<str2.length();i++) {
			for(int j=i+1;j<str2.length();j++) {
				if(arr1[j] < arr1[i]) {
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
			
		}
		System.out.println(arr1);

	}

}
