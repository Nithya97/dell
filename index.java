import java.io.*;
import java.util.*;
class  index
{
public static void main(String args[])
{int ss=0;
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int n[]=new int[a];
for(int i=0;i<a;i++)
{n[i]=s.nextInt();
}
Arrays.sort(n);
for(int i=0;i<a;i++)
{
if(i==n[i])
{System.out.println(i);
ss=1;}}
if(ss==0)
System.out.println("none of the values are equal to index");
}}
