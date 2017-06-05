
import java.io.*;
class frepeat
{
public static void main(String args[])
{int s=0;
int a[]=new int[args.length];
for(int i=0;i<args.length;i++)
{
a[i]=Integer.parseInt(args[i]);
}
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{if(s==0)
{if(a[i]==a[j])
System.out.println(a[i]);
s=1;}}
}}}
