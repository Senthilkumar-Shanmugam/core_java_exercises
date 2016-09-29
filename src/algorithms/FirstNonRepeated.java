package algorithms;

import java.util.Scanner;

public class FirstNonRepeated {

	public static void main(String[] args) {
         System.out.println("please enter the string");
         Scanner in = new Scanner(System.in);
         String s=in.nextLine();
          int c =  s.length();
          boolean nonReap = false;
          for(int i=0;i<c;i++){
        	char letter = s.charAt(i);
        	for(int j=i+1;j<c-1;j++)
        	{
        		if(letter != s.charAt(j))
        			continue;
        		
        			
        	}
          }
         
		
		
	}

}
