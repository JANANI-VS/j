import java.io.*;
import java.util.*;
public class LeapYear 
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int a1=sc.nextInt();
		if((a1%4)==0)
		{
			System.out.println("Entered "+a1+" year is leap year");
		}
		else
		{
			System.out.println("Entered "+a1+" year is non-leap year");
		}
		
	}

}
