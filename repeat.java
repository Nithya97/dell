import java.io.*;
import java.util.*;
class repeat
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int n[]=new int[a];
int nn[]=new int[a];
for(int i=0;i<a;i++)
{
n[i]=s.nextInt();
}
Arrays.sort(a);
nn[sum++]=n[a-1];
for(int i=a-2;i>=0;i--)
{
if(a[i]==a[i+1])
nn[sum++]=a[i];}
for(int k=0;k<sum;k++)
{
System.out.println(nn[k]);
}}}
