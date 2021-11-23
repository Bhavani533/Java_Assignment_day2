package javaStrings;
import java.util.Scanner;
public class ReverseStr {
	public static void main(String args[])
	{
		System.out.println("Enter first string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch;
		String nstr = "";
		for(int i=0;i<str.length();i++)
		{
			ch = str.charAt(i);
			nstr = ch+nstr;
		}
		System.out.println(nstr);
		sc.close();
	}

}
