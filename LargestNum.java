import java.io.*;
import java.util.*;
public class LargestNum 
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a1=sc.nextInt();
		System.out.println("Enter the second number");
		int a2=sc.nextInt();
		System.out.println("Enter the third number");
		int a3=sc.nextInt();    
		if(a1>a2 && a1>a3)
		{
			System.out.println("The largest number is "+a1);
			
		}
		else if(a1<a2 && a3<a2)
		{
			System.out.println("The largest number is "+a2);
			
		}
		else if(a1<a3 && a2<a3)
		{
			System.out.println("The largest number is "+a3);
			
		}
		
		
	}

}
