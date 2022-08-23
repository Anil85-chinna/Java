package Spack;

import java.util.Scanner;

public class Ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER THE SENTENCE");
		String s1=scan.nextLine();
		String s2="";
		String[] arr=s1.split(" ");
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[i].length()-1;j>=0;j--) {
				s2=s2+arr[j];
				System.out.println(arr[j]);
			}
			System.out.println(arr[i]);
			
		}
		

	}

}
