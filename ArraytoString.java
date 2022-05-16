//toString() cannot be used as char is in type of character array
//If it is integer,then toString() is used

//Cannot get direct char input
//only string input
//string to char and then to array and then to string

//using valueOf() method

/*
import java.util.*;
public class ArraytoString {
	static String str1;
	public static String ArrtoString(char[] a) {
		str1 = String.valueOf(a);
		return str1;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a String to convert to character array :");
		
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		System.out.print("The character array is : ");
		for(int i=0;i<str.length();i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.print("The String is : ");
		System.out.println(ArrtoString(ch));
		
	}
}
*/

//using new String() method

import java.util.*;
public class ArraytoString {
	static String str1;
	public static String ArrtoString(char[] a) {
		str1 = new String(a);
		return str1;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a String to convert to character array :");
		
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		System.out.print("The character array is : ");
		for(int i=0;i<str.length();i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.print("The String is : ");
		System.out.println(ArrtoString(ch));
		
	}
}
