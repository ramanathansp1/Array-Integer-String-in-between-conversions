//Integer.parseInt, Integer.toString can have both str and int inside ()
//(i.e) Integer.parseInt(str)(here),   Integer.parseInt(int)(int to str)

//Integer.parseInt(str) is used
import java.util.*;
public class StringtoInteger {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String to convert to integer : ");
		String str = sc.nextLine();
		int num = Integer.parseInt(str);
		System.out.print("The Integer is : " + num);
	}
}
