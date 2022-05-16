//Integer.toString is used

import java.util.*;
public class IntegertoString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Integer : ");
		int num = sc.nextInt();
		String str = Integer.toString(num);
		System.out.print("The String is : " + str);
	}
}
