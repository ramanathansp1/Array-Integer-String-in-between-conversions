//just using multiplication of int arrays
//num = (num*10)+ val

import java.util.*;
public class ArraytoInteger {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of Integer array : ");
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the Elemenet " + i + ": ");
			num[i] = sc.nextInt();
		}
		int convnum = 0;
		for(int i=0;i<n;i++) {
			convnum = (convnum*10) + num[i];
		}
		
		System.out.println(convnum);
		
	}
}
