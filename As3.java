package Spack;

import java.util.Arrays;  
   
public class As3 {  
     void anagram(String str1, String str2) {  
        String s1 = str1;
        String s2 = str2;
        if (s1.length() != s2.length()) {  
            System.out.println("This is not anargam");  
        } else {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            if(Arrays.equals(ArrayS1,ArrayS2)) {
            	System.out.println("This is anagram");
            }
        }
         
    }  
   
    public static void main(String[] args) {  
    	As3 obj=new As3();
    	obj.anagram("Anil","aNiL");
    	obj.anagram("hfjkw"," ");
        
    }  
}