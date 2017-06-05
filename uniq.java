import java.io.*;
import java.util.*;
class uniq
{public static void main(String args[])
{int s=0;
int a[]=new int[args.length];
for(int i=0;i<args.length;i++)
{
a[i]=Integer.parseInt(args[i]);
}
for(int j=0;j<a.length;j++)
{s=0;
for(int k=j+1;k<a.length;k++)
{if(s==0)
{if(a[j]==a[k])
s=1;}}
if(s==0)
{
System.out.println(a[j]);
break;}
}}}
