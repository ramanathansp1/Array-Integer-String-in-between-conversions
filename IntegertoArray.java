//this will print integer to character array
//final ans will be in type char array


/*
import java.util.*;
public class IntegertoArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Integer : ");
		int num = sc.nextInt();
		String str = Integer.toString(num);
		char[] arr = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			System.out.println(arr[i]);
		}
	}
}
*/


//using charAt() - '0' method

import java.util.*;
public class IntegertoArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Integer : ");
		int num = sc.nextInt();
		String temp = Integer.toString(num);
		int[] numarr = new int[temp.length()];
		
		for(int i=0;i<temp.length();i++) {
			numarr[i] = temp.charAt(i) - '0';
		}
		
		for(int j=0;j<temp.length();j++) {
			System.out.print(numarr[j]);
		}
	}
}
