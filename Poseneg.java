import java.io.*;
import java.util.*;
public class Poseneg
{
public static void main(String[] args)throws IOException
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a<0)
{
System.out.println("Negative");
}
else if(a>0)
{
System.out.println("Positive");
}
else
{
System.out.println("Zero");
}
}
}
