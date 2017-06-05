import java.io.*;
import java.util.*;
class repeat
{
public static void main(String args[])
{int ss=0;
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int n[]=new int[a];

for(int i=0;i<a;i++)
{
n[i]=s.nextInt();
}

for(int i=0;i<a;i++)
{
  for(int j=i+1;j<a;j++)
  {
if(n[i]==n[j])
{
  System.out.println(n[i]);
ss=1;}}}
    if(ss==0)
System.out.println("no repeated numbers");
}}
