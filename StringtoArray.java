
	/*
	 //using chaAt() method
	import java.util.Scanner;
	public class StringtoArray {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter a string : ");
			String str = sc.nextLine();
			
			char[] ch = new char[str.length()];
			
			for(int i=0;i<str.length();i++) {
				ch[i] = str.charAt(i);
			}
			
			for(int j=0;j<str.length();j++) {
				System.out.print(ch[j]);
			}
		}
	}
	


*/


	//using toCharArray() method
	import java.util.Scanner;
	public class StringtoArray {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter a string : ");
			String str = sc.nextLine();
			
			char[] ch =str.toCharArray();
			
			for(int i=0;i<str.length();i++) {
				System.out.print(ch[i]);
			}
		}
	}



