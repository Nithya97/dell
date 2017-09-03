import java.util.*;
class Matrix
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int f=0;
int n1[][]=new int[n][n];
int n2[][]=new int[n][n];
int l=0,m=0;
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
n1[i][j]=s.nextInt();
}
}
for(int i=0;i<n;i++)
{f=0;
for(int j=0;j<n;j++)
{f=0;
l=i;
    for(int k=0;k<n;k++)
    {
        if(n1[l][k]==0)
      {  f=1;break;}
    }
m=j;
    for(int k=0;k<n;k++)
    {
        if(n1[k][j]==0)
       { f=1; break;}
    }

    if(f==0)
    n2[i][j]=1;
    else
    n2[i][j]=0;
}
}

for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
        System.out.print(n2[i][j]);
    }System.out.println();
}
}
}
