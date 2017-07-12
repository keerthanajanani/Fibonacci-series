# Fibonacci-series
import java.io.*;
import java.util.*;
public class Fibonacci series
{
public static void main(String args[])throws IOException
{
int n,n1=0,n2=1,n3,count=10,i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number"):
n=Integer.parseInt(br.readLine());
System.out.println(n1+" "+n2);
for(i=2;i<count;i++)
{
n3=n1+n2;
System.out.println(""+n3);
n1=n2;
n2=n3;
}
}
}
