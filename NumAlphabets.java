import java.io.*;
import java.util.*;
public class NumAlphabets 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		   System.out.println("Enter the character");
		char a=(char) br.read();
		if( (a>='a' && a<='z') || (a>='A' && a<='Z'))
	        {
			System.out.println("alphabet");
	        }
	    else if(a>=0 || a<=0)
	    {
	    	System.out.println("number");
	    }
	        
		
		
	}

}
