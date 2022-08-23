package Spack;

import java.util.Scanner;

class rs{
public static void main(String[] args) {    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your String");
    String Str1=sc.nextLine();
    String Str2="";
    //USING FOR/ITERATION
    for(int i=Str1.length()-1;i>=0;i--) {
    	Str2=Str2+Str1.charAt(i);
    }
    System.out.println(Str2);
    //USING STRINGbUFFER && STRINGBUILDER
    StringBuilder s1=new StringBuilder();
    s1.append(Str1);
    System.out.println(s1.reverse());
    //using tocharrArray
    char cA[]=Str1.toCharArray();
    String Str3="";
    for(int i=Str1.length()-1;i>=0;i--) {
    	Str3=Str3+cA[i];
    }
    System.out.println(Str3);
    
   
    
}    
}    