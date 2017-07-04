# j
import java.io.*;
import java.util.*;
public class oddeven
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n;
    System.out.println("Enter an integer");
    n=Integer.parseInt(br.readLine());
    if(n%2==0)
    {
      System.out.println("Entered number is even");
    }
    else
    {
      System.out.println("Entered number is odd");
    }
  }
  }
